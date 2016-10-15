package org.javaday.prototypeVSsingleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.javaday.prototypeVSsingleton");
        context.close();
    }
}
