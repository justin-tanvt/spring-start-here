package config;

import domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    // adding the @Bean annotation tells Spring to:
    // 1. call this method when initialising the context, and
    // 2. add the value returned from this method to the context
    // ++ this also means that any method annotated with @Bean is automatically added to the context, regardless
    // if it is explicitly referred to.

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
