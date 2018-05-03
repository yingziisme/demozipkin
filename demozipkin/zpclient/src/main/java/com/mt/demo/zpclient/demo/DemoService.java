package com.mt.demo.zpclient.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DemoService
 *
 * @author MT.LUO
 * 2018/5/2 15:44
 * @Description:
 */
@FeignClient(value = "zipkin-client-two")
public interface DemoService {
    @RequestMapping("/demo/two/{name}")
    public String twoHi(@PathVariable(name = "name") String name);
}
