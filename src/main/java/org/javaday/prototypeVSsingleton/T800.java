package org.javaday.prototypeVSsingleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Evegeny on 16/05/2016.
 */
@Scope("prototype")
@Component
public class T800 {
    @PostConstruct
    public void init(){
        System.out.println("Give me your clothes");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Astalavista baby");
    }
}
