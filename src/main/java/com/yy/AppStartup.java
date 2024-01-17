package com.yy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gongcy
 * @date 2022/11/14 5:35 下午
 * @Description
 */
@SpringBootApplication
@MapperScan("com.yy.dao")
public class AppStartup {

    public static void main(String[] args) {
        SpringApplication.run(AppStartup.class,args);
    }
}
