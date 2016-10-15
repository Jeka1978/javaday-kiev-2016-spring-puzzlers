package org.javaday.game.of.trones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Evegeny on 15/10/2016.
 */
@Configuration
public class JavaConfig {
    @Bean
    public String str(){
        return "WTF";
    }
}
