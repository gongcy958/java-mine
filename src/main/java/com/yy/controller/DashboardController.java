package com.yy.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author gongcy
 * @date 2023/6/27 1:39 下午
 * @Description
 */
@RestController
@RequestMapping(value = "/api/dashboard")
public class DashboardController {

    @GetMapping("/source")
    public void getSourceData(
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") String startTime,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") String endTime) {


        System.out.println("测试");

    }


}
