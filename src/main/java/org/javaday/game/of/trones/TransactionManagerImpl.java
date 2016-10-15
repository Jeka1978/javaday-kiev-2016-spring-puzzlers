package org.javaday.game.of.trones;

import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 18/04/2015.
 */
@Component
public class TransactionManagerImpl implements TransactionManager {
    private int depth = 0;

    public void openTransaction() {
        System.out.println("*************TRANSACTION OPENED***************");
        depth++;
    }

    public void commit() {
        System.out.println("*************TRANSACTION COMMITTED***************");
        depth--;
    }

    public void rollback() {
        depth=0;
        System.out.println("*************ROLLED BACK***************");
    }

    public boolean isTransactionOpened() {
        return depth>0;
    }

    public int getOrder() {
        return 1;
    }
}
