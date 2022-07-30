package com.ming.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ming.order.feign.StockFeignService;

@RestController
@RequestMapping("/order")
public class OrderController {

    /*@Autowired
    RestTemplate restTemplate;*/

    @Autowired
    StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功");
//        String msg = restTemplate.getForObject("http://localhost:8011/stock/reduce", String.class);
        String msg = stockFeignService.reduce();
        return msg;
    }
}
