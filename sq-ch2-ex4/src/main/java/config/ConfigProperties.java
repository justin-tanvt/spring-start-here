package config;

import main.Eagle;
import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {

    @Bean(name = "koko")
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(value = "miki")
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean("kiki")
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean(value = "kiko")
    Eagle eagle1() {
        Eagle e = new Eagle();
        e.setName("Kiko");
        return e;
    }
}
