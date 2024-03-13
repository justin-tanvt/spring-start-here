package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Riki");
        return p;
    }

}
