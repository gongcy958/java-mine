package com.yy.log;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongcy
 * @date 2022/11/14 5:28 下午
 * @Description
 */
@RequestMapping("logging")
@RestController
@Log4j2
public class LoggingController {

    @GetMapping("log")
    public void log() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

    public static void main(String[] args) {
        log.debug("debug");
        log.info("info");
        log.error("error");
        log.warn("warn");
    }
}
