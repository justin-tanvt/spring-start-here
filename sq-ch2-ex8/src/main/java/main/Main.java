package main;

import config.EmptyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(EmptyConfig.class);

        Random rd = new Random();
        int numberOfBeans = 3 + rd.nextInt(6);      // generate between 3-8 beans
        System.out.println(numberOfBeans + " beans will be instantiated!");

        System.out.println();
        List<Parrot> parrots = new ArrayList<>();
        for (int i = 0; i < numberOfBeans; i++) {
            Parrot p = new Parrot();
            p.setName("parrot" + i);

            if (rd.nextDouble() < 0.5) {
                p.setColour("red");
            } else {
                p.setColour("green");
            }

            System.out.println(p.getName() + " will be " + p.getColour());
            parrots.add(p);
        }

        System.out.println();
        boolean hasPrimary = false;
        for (Parrot p : parrots) {
            if (!p.getColour().equals("green")) {
                continue;
            }

            boolean setToPrimary = !hasPrimary;
            context.registerBean(p.getName(), Parrot.class, () -> p, bc -> bc.setPrimary(setToPrimary));
            System.out.println(p.getName() + " of colour " + p.getColour() + " has been added to the context with primary=[" + setToPrimary + "]");

            if (setToPrimary) {
                hasPrimary = true;
            }
        }

        System.out.println();
        Collection<Parrot> parrotsInContext = context.getBeansOfType(Parrot.class).values();
        for (Parrot p : parrotsInContext) {
            System.out.println(p.getName() + " of colour " + p.getColour() + " found in the context");
        }
        Parrot mainP = context.getBean(Parrot.class);
        System.out.println("the primary Parrot is " + mainP.getName() + " of colour " + mainP.getColour());
    }
}
