package com.lgsc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 服务注释111
 * @作者 admin
 * @时间 2017-05-27
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class Myservice1Application {

    public static void main(String[] args) {
    	SpringApplication.run(Myservice1Application.class, args);
    }

}