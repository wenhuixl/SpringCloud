package uwitec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wenhui
 * @description
 * @Date 2019/8/3
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderAppRun {

    public static void main(String[] args) {
        SpringApplication.run(OrderAppRun.class, args);
    }

    // 如果使用reset方式进行依赖ribbon负载均衡器

    @Bean
    @LoadBalanced // 开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
