package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Person {
    private String name = "Ella";

    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Person : " + name;
    }
}
