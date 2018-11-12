package com.udainnet.cloud.apiserver.web;

import com.udainnet.cloud.apiserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : RaoJun
 * @date : Created in 2018/11/6 17:30
 * @description :
 */
@RestController("API-HelloController")
@RequestMapping(path = "hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public Object helloTest() {
        return helloService.helloTest();
    }


}
