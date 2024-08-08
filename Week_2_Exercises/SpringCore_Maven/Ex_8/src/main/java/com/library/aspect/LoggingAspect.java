package com.library.aspect;

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@EnableAspectJAutoProxy
@Aspect
@Component
public class LoggingAspect {
	@Around("execution(* com.library.service.BookService.*(..))")
	public Object logExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        // Display message
		double start1 = System.nanoTime();
        
 
        Object obj = pjp.proceed();
 
        // Display message
        double end1 = System.nanoTime();  
        
//        obj.test();
           
        System.out.println("Execution Time in nano seconds: "+ (end1-start1)); 
 
        return obj;
    }
	public static void test() {
		System.out.println("testeing");
	}
}
