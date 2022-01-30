package com.example.demo.kafkaproducer.Restcontroller;

import com.example.demo.kafkaproducer.dao.Book;
import com.example.demo.kafkaproducer.dao.Car;
import org.apache.kafka.common.internals.Topic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class DemoController {

   //@Autowired
    //KafkaTemplate<String,String> kafkaStringTemplate;

    @Autowired
    KafkaTemplate<String,Object> kafkabookTemplate;

    private static final String kafkaTopic="demotopic";
    public String get() {
        return "Hello World";
    }

  //  @GetMapping("/publish")
   // public String publishmessage(@RequestParam("msg") String msg){
     //   kafkaStringTemplate.send(kafkaTopic,msg);
       // return "Message Published successfully";
    //}

    @PostMapping("/publishBook")
    public String publishJson(@RequestBody Book book)
    {
        kafkabookTemplate.send(kafkaTopic,book);
        return "Message Published successfully";
    }

    @PostMapping("/publishCar")
    public String publishCar(@RequestBody Car car)
    {
        kafkabookTemplate.send(kafkaTopic,car);
        return "Message Published successfully";
    }

}