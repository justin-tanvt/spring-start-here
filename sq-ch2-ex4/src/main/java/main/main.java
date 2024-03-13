package main;

import config.ConfigProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigProperties.class);

        Parrot miki = context.getBean("miki", Parrot.class);
        System.out.println(miki.getName());

        System.out.println(context.getBean("koko"));
        // cant use getName() here because the object returned by getBean() is of type Object, for which the getBean()
        // method has not been declared
        System.out.println(context.getBean(Eagle.class).getName());

        System.out.println(context.getBean("kiki", Parrot.class).getName());
        // similarly, getName() can be used here as the object returned by getBean() is of type Parrot
    }
}
