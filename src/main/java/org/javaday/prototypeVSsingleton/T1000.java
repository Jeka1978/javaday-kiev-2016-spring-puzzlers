package org.javaday.prototypeVSsingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Evegeny on 16/05/2016.
 */
@Scope("singleton")
@Component
public class T1000 {
    @Autowired
    private T800 t800;

    @PostConstruct
    public void init(){
        System.out.println("Where is John Connor");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Страшные звуки");
    }


}
