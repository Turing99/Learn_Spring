package main;

import Services.HelloService;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try(var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            HelloService service = c.getBean(HelloService.class);
            String message = service.hello("John");
            System.out.println("Result is " + message);
        }

    }
}
