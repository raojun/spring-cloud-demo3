package com.udiannet.cloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : RaoJun
 * @date : Created in 2018/11/6 16:31
 * @description :
 */
@EnableEurekaServer
@SpringBootApplication
public class BootStrapEureka {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BootStrapEureka.class);
        app.run(args);
    }
}
