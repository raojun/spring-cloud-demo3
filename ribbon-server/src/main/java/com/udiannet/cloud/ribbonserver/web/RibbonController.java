package com.udiannet.cloud.ribbonserver.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : RaoJun
 * @date : Created in 2018/11/7 19:57
 * @description :
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET, path = "/ribbon")
    public String ribbon(String name){
        return restTemplate.getForEntity("http://API-SERVER-1/hello/test", String.class).getBody();
    }
}
