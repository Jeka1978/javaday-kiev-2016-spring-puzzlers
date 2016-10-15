package org.javaday.iLoveInterfaces;

/**
 * Created by Evegeny on 17/05/2016.
 */
public class ПытательныйПаяльник implements Паяльник {
    @Override
    public void греться() {
        System.out.println("Разогреваюсь медленно ...");
    }
}
