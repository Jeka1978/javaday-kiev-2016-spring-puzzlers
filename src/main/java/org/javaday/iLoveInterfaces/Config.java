package org.javaday.iLoveInterfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Evegeny on 16/05/2016.
 */
@Configuration
public class Config {
    @Bean
    public Паяльник паяльник() {
        return new ПытательныйПаяльник();
    }


}
