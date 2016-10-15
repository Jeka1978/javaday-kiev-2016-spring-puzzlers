package org.javaday.game.of.trones;

import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 15/10/2016.
 */
@Service
public class WinterIsComingServiceImpl implements WinterIsComingService {

    @Override
    @Transaction
    @PostInitialize
    public void warmCache() {
        System.out.println("reading spell from cassandra");
    }

    @Override
    public void resurrectJonSnow() {
        //// TODO: ?/?/2016
    }
}
