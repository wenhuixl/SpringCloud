package com.uwitec.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenhui
 * @description
 * @Date 2019/8/3
 */
@RestController
public class MemberApiController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getMember")
    public String getMember() {
        return "this is getMember"+port;
    }
}
