package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* Services.HelloService.hello(..))")
//    public void before() {
//        System.out.println("A");
//    }
//
//    @After("execution(* Services.HelloService.hello(..))")
//    public void after() {
//        System.out.println("B");
//    }
//
//    @AfterReturning("execution(* Services.HelloService.hello(..))")
//    public void afterReturning() {
//        System.out.println("C");
//    }
//
//    @AfterThrowing("execution(* Services.HelloService.hello(..))")
//    public void afterThrowing() {
//        System.out.println("D");
//    }

    @Around("execution(* Services.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("A");
        Object result = null;
        try {
            result = joinPoint.proceed(new Object[]{"Bill"});
            System.out.println("B");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }




}
