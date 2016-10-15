package org.javaday.nomore.interfaces;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by Jeka on 19/04/2015.
 */
@Service
public class IHateInterfaces{
    public void killAllInterfaces(){
        System.out.println("It works without interfaces!!!");
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaday.nomore.interfaces");
        System.out.println(context.getBean("IHateInterfaces").getClass());
                context.getBean(IHateInterfaces.class).killAllInterfaces();
    }

}
