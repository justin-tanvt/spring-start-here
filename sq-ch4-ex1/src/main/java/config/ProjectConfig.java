package config;

import beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Bean
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "kiki")
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Kiko");
        return p;
    }
}
