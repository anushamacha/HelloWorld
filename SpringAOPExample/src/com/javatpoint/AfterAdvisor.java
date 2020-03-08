package com.javatpoint;  
import java.lang.reflect.Method;  
public class AfterAdvisor implements AfterReturningAdvice{  
    public void afterReturning(Object returnValue, Method method,  
         Object[] args, Object target) throws Throwable {  
          
        System.out.println("additional concern after returning advice");  
    }  
  
}  