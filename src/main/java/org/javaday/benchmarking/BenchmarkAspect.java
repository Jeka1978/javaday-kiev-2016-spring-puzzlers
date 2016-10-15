package org.javaday.benchmarking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by Evegeny on 14/10/2016.
 */
@EnableAspectJAutoProxy
@Aspect
@Component
public class BenchmarkAspect {

    @Around("@annotation(org.javaday.benchmarking.Benchmark)")
    public void doTransaction(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.nanoTime();
        pjp.proceed();
        long end = System.nanoTime();
        System.out.println("time in millis for "+pjp.getSignature().getName()+" : "+ TimeUnit.NANOSECONDS.toMillis(end-start));
    }
}
