package com.itmayiedu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-23 下午 5:23
 */
@SpringBootApplication
@EnableEurekaClient
public class AppConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient.class);
    }
}
