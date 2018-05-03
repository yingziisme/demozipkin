package com.mt.demo.zpclient.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * DemoController
 *
 * @author MT.LUO
 * 2018/5/2 15:43
 * @Description:
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping("/one/{name}")
    public String oneHi(@PathVariable String name) {
        return "rest " + restTemplate.getForObject("http://localhost:8812/demo/one/" + name,String.class);
    }

    @ResponseBody
    @RequestMapping("/two/{name}")
    public String twoHi(@PathVariable String name) {
        return "feign " + demoService.twoHi(name);
    }
}
