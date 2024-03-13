package main;

import org.springframework.stereotype.Component;

@Component
// the @Component annotation tells Spring that this class is a Component that needs to be instantiated and added to the
// Spring context upon its initialisation. This allows us to write less code to add beans
// -- however, this is not an option for 3rd party libraries unless we modify the class' source code
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
