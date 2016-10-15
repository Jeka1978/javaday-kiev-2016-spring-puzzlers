package org.javaday.nomore.interfaces;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 19/04/2015.
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class LittleBoyAspect {
    @After("execution(* org.javaday.nomore.interfaces..*.*(..))")
    public void whyInterfaces() {
        System.out.println("Even with aspect it works!!!");
    }


}
