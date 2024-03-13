package main;

import config.ProjectConfig;
import domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);
        // specifying the ProjectConfig class when instantiating the Spring context tells Spring to:
        // 1. use this configuration class (one amongst many possible configs) when initialising its context

        Parrot p = context.getBean(Parrot.class);
        // getBean(Parrot.class) tells Spring to:
        // 1. look within its context for a Bean (a.k.a. object) that has been instantiated from the Parrot class, and
        // 2. return a reference to that Bean/object
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
