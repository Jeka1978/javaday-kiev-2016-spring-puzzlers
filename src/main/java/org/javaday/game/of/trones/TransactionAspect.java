package org.javaday.game.of.trones;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 15/10/2016.
 */
@EnableAspectJAutoProxy
@Aspect
@Component
public class TransactionAspect {

    @Autowired
    private TransactionManager transactionManager;

    @Around("@annotation(org.javaday.game.of.trones.Transaction)")
    public void doWithTransaction(ProceedingJoinPoint pjp) throws Throwable {
        transactionManager.openTransaction();
        try {
            pjp.proceed();
            transactionManager.commit();
        } catch (Exception e) {
            transactionManager.rollback();
            throw new RuntimeException(e);
        }
    }
}
