package org.javaday.benchmarking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Evegeny on 14/10/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaday.benchmarking");
        context.getBean(JavadayService.class).ultraFast();
    }
}
