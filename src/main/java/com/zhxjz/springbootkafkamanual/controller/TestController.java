package com.zhxjz.springbootkafkamanual.controller;

import com.zhxjz.springbootkafkamanual.manual.ManualProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangke
 * @date 2020/11/10 16:09
 * @description
 */

@RestController
public class TestController {

    @Autowired
    private ManualProducer manualProducer;

    @GetMapping("/manual")
    public void manualProducer() {
        manualProducer.send("this is manual operate");

        for (int i = 0; i < 10; i++) {
            manualProducer.send("Message【" + i + "】：my name is zhangsan");
        }
        return ;
    }
}
