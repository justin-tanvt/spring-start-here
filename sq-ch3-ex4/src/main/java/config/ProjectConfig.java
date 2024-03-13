package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    public Person person(Parrot parrot) {
        // defining a parameter in a method annotated with @Bean tells Spring to look for a qualifying bean in its
        // context of the type in the parameter. if the bean is not yet created, Spring creates it and then uses a
        // reference to it in the remaining calling method's body.
        System.out.println("person bean method called!");
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        System.out.println("parrot set in person");
        System.out.println("returning person bean");
        return p;
    }

    @Bean
    public Person otherPerson() {
        System.out.println("other person bean method called!");
        Person p = new Person();
        p.setName("Mike");
        System.out.println("returning other person bean");
        return p;
    }

    @Bean
    public Parrot parrot() {
        System.out.println("parrot bean method called!");
        Parrot p = new Parrot();
        p.setName("Koko");
        System.out.println("returning parrot bean");
        return p;
    }
}
