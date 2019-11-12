package com.learnjava.eurekaserversevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerSeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSeviceApplication.class, args);
    }

}
