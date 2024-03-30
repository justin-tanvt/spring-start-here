package config;

import main.Pupil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class OneOfManyConfigs {

    @Bean
    @Primary
    // - an alternative to referring to beans by their name is to declare one of them as the primary
    // this tells Spring which bean to choose when there are multiple options and no name is specified
    // this is done using the @Primary annotation
    Pupil pupil1() {
        Pupil p = new Pupil();
        p.setName("Alpha");
        return p;
    }

    @Bean
    Pupil pupil2() {
        Pupil p = new Pupil();
        p.setName("Beta");
        return p;
    }

    @Bean
    Pupil pupil3() {
        Pupil p = new Pupil();
        p.setName("Charlie");
        return p;
    }
}
