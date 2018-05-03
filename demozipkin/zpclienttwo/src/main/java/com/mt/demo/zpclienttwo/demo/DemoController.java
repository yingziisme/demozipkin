package com.mt.demo.zpclienttwo.demo;

import org.springframework.web.bind.annotation.*;

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

    @ResponseBody
    @RequestMapping("/one/{name}")
    public String oneHi(@PathVariable String name) {
        return "one rest " + name;
    }

    @ResponseBody
    @RequestMapping("/two/{name}")
    public String twoHi(@PathVariable String name) {
        return "two feign " + name;
    }
}
