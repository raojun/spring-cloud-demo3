package com.udiannet.cloud.feignserver.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : RaoJun
 * @date : Created in 2018/11/13 9:42
 * @description :
 */
@FeignClient(value = "API-SERVER-1")
public interface FeignService {

    @RequestMapping(method = RequestMethod.GET, path = "/hello/test")
    public String feign();
}
