package beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";

    public Parrot() {
        System.out.println("parrot constructor called!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
