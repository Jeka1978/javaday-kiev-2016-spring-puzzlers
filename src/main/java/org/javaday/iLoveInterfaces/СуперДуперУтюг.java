package org.javaday.iLoveInterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 14/05/2016.
 */
@Component
public class СуперДуперУтюг implements Утюг {
    @Override
    public void разогреваться() {
        System.out.println("разогреваюсь");
    }

//    @PostConstruct
    @Autowired
    public void гретьВоду(Вода вода){
        System.out.println(вода+" грейся...");
    }
}
