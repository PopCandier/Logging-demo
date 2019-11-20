package com.pop.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: logging-demo
 * @description:
 * @author: Pop
 * @create: 2019-11-20 17:14
 **/
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/")
    public String hello(){
////日志级别从低到高分为
// TRACE < DEBUG < INFO < WARN < ERROR < FATAL，
// 如果设置为WARN，则低于WARN的信息都不会输出。
        log.trace(" trace 信息");
        log.debug(" debug 信息");
        log.info(" info 信息");
        log.warn(" warn 信息");
        log.error(" error 信息");

        return "hello , world";
    }

}
