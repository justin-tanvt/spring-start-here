package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Person person() {
        System.out.println("person bean method called!");
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot());
        System.out.println("parrot set as person's");
        // wiring can be achieved by calling a Bean's method from another within the configuration class
        // the calling Bean uses a reference of the called Bean to define a relationship between them
        // shown above, the Person calls the Parrot class to define a has-A relationship (i.e. Person has-A Parrot)

        // when two methods annotated with @Bean call each other, Spring recognises that a link is trying to be made
        // between beans. instead of creating Parrot twice, when Spring calls parrot() from within person(), it first
        // checks if there is already a Parrot bean in the Spring context, and only creates one if it doesn't exist yet
        System.out.println("returning person bean");
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
