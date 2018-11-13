package com.udiannet.cloud.feignserver.web;

import com.udiannet.cloud.feignserver.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : RaoJun
 * @date : Created in 2018/11/7 19:57
 * @description :
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(method = RequestMethod.GET, path = "/feign")
    public String feign(){
        return feignService.feign();
    }
}
