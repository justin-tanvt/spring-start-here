package main;

import config.OneOfManyConfigs;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(OneOfManyConfigs.class);

        Pupil oneOfManyPupilInstancesInContext = context.getBean(Pupil.class);
        System.out.println(oneOfManyPupilInstancesInContext.getName());
    }
}
