package uwitec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wenhui
 * @description
 * @Date 2019/8/3
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberTwoAppRun {

    public static void main(String[] args) {
        SpringApplication.run(MemberTwoAppRun.class, args);
    }

}
