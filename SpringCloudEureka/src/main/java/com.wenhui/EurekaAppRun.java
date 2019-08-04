package com.wenhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**111
 * @author wenhui
 * @Date 2019/8/3
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaAppRun {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAppRun.class, args);
    }

}
