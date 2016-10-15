package org.javaday.benchmarking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Created by Evegeny on 15/10/2016.
 */
//@Configuration
public class Conf {
    @Resource
    private JavadayService javadayService;

    @Bean
    public JavadayService javadayService(){
        JavadayServiceImpl service = new JavadayServiceImpl();
        service.setProxy(javadayService());
        return service;
    }

}
