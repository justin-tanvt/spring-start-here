package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        // using stereotype annotations limits us from configuring/controlling the instance until after it is created
        p.setName("Koko");
        System.out.println(p.getName());
        System.out.println(p.hashCode());

        Parrot p2 = context.getBean(Parrot.class);
        p2.setName("Miki");
        System.out.println(p2.getName());
        System.out.println(p2.hashCode());

        // the above code shows that the same object is returned when getBean() is called on Parrot.class
        // no identifier is needed here as there can only ever be one Parrot
    }
}
