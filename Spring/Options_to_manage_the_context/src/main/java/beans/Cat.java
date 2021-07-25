package beans;

import org.springframework.stereotype.Component;

//@Component
public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
