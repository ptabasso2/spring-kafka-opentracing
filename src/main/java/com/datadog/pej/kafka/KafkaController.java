package com.datadog.pej.kafka;

import com.datadog.pej.kafka.consumer.Receiver;
import com.datadog.pej.kafka.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class KafkaController {

    @Autowired
    private Receiver receiver;

    @Autowired
    private Sender sender;

    @RequestMapping("/test")
    public String index() {
        sender.send("Un message plus long");

        try {
            receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
            System.out.println("getCount(): " + receiver.getLatch().getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "test";
    }


}
