package com.rui.tiger.auth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yangxiang
 * @date 2019/9/20 11:03
 */

@SpringBootApplication
@ComponentScan("com.rui.tiger.auth")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
