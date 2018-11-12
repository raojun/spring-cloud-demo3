package com.udainnet.cloud.apiserver.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : RaoJun
 * @date : Created in 2018/11/6 17:37
 * @description :
 */
@Component
public class HelloService {
    private static Logger log = LoggerFactory.getLogger(HelloService.class);

    @Autowired
    private DiscoveryClient client;
    @Autowired
    private Registration registration;

    public Object helloTest() {
        ServiceInstance instance = serviceInstance();
        String result = "/helloTest, host:port=" + instance.getUri() + ", service_id:" + instance.getServiceId();
        log.info(result);
        return "From api-server-1, " + result;
    }

    public ServiceInstance serviceInstance() {
        List<ServiceInstance> list = client.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            for (ServiceInstance si : list) {
                if (si.getPort() == 9005 || si.getPort() == 9006) {
                    return si;
                }
            }
        }
        return null;
    }
}
