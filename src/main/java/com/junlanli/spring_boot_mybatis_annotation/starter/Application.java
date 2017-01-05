package com.junlanli.spring_boot_mybatis_annotation.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Copyright (C) 2015 - 2016 SOHU FOCUS Inc., All Rights Reserved.
 *
 * @Author: junlanli@sohu-inc.com
 * @Date: 2016-12-06
 */
@SpringBootApplication(scanBasePackages = "com.junlanli.spring_boot_mybatis_annotation")
@ServletComponentScan(basePackages = "com.junlanli.spring_boot_mybatis_annotation")
@MapperScan(basePackages = "com.junlanli.spring_boot_mybatis_annotation")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
