package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean("parrot2", Parrot.class);
        // - if multiple Beans of the same type are declared in the context's configuration, Spring will:
        // 1. have instantiated them when initialising its context (I assume they are floating around the context), and
        // 2. find multiple Beans of the same type (if "getBean" is called with only a class name as its parameter), and
        // 3. will not know which Bean to return a reference of due to this ambiguity
        // therefore, Spring needs to be precisely told which of the instances we are referring to, via an identifier

        // - each Bean has a name, which is used to identify it
        // - if a Bean is not explicitly named, it takes the name of its method by default (ie. "parrot2" above)
        System.out.println(p.getName());
    }
}
