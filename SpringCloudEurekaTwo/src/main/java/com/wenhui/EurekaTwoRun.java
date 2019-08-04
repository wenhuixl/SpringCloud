package com.wenhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wenhui
 * @description
 * @Date 2019/8/4
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaTwoRun {

    public static void main(String[] args) {
        SpringApplication.run(EurekaTwoRun.class, args);
    }

}
