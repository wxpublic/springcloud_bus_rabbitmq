package com.itmayiedu.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-23 下午 5:21
 */
@RefreshScope //手动刷新注解，生产环境可以把所有的读取属性集中放在一个类中处理
@RestController
public class ConfigController {
    @Value("${user.default}")
    private String gitServerName;

    @RequestMapping("/getServerName")
    public String getItmayieduinfo(){
        return gitServerName;
    }
}
