package com.yy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author gongcy
 * @date 2022/12/27 9:16 下午
 * @Description
 */
@RestController
@RequestMapping("/test")
public class CurrentAddController {


    @GetMapping("/add")
    public void sameAdd() {
        System.out.println("hello");
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,20,500, TimeUnit.SECONDS,new ArrayBlockingQueue<>(20));
        for (int i = 0; i < 100; i++) {
            executor.execute(new UncWorker());
        }
    }
}
