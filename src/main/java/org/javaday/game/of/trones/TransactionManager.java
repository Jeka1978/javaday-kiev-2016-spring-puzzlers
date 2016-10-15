package org.javaday.game.of.trones;

/**
 * Created by Jeka on 18/04/2015.
 */
public interface TransactionManager {
    void openTransaction();

    void commit();

    void rollback();

    boolean isTransactionOpened();
}
