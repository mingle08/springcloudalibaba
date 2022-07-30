package com.ming.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * name 指定要调用的rest接口的服务名（需要nacos发现服务）
 * path 指定要调用的rest接口的controller上的@RequestMapping
 */
@FeignClient(name = "stock-service", path = "/stock")
public interface StockFeignService {

    // 声明需要调用的rest接口对应的方法
    @RequestMapping("/reduce")
    String reduce();
}
