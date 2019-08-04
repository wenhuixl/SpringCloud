package uwitec.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wenhui
 * @description
 * @Date 2019/8/3
 */
@RestController
public class OrderApiController {

    @Autowired
    private RestTemplate testTemplate;

    /**
     * 在SpringCloud中有两种方式调用 rest、fegin
     * @author wenhui
     * @date 2019/8/3
     * @return
     */
    @GetMapping("/getOrder")
    public String getMember() {
        String url = "http://spring-cloud-member/getMember";
        String result = testTemplate.getForObject(url, String.class);
        return result;
    }
}
