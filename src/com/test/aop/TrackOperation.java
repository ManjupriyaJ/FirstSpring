package com.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect  
public class TrackOperation{ 
	
@Pointcut("execution(* Operation.msg(..))")  
 public void k1(){}//pointcut name  

@Pointcut("execution(* Operation.m(..))")  
public void k2(){}//pointcut name  
    
@Pointcut("execution(* Operation.k1(..))")  
public void k3(){}//pointcut name  
    
@AfterReturning(pointcut="execution(* Operation.ka(..))", returning="result")//applying pointcut on before advice  
 public void myadvice4(JoinPoint jp,Object result)//it is advice (AfterReturning advice)  
{  
	System.out.println("additional concern");  
	System.out.println("Method Signature: "  + jp.getSignature());  
  System.out.println("Result in advice: "+result);  
  System.out.println("end of after returning advice...");  

}  
@AfterThrowing(pointcut="execution(* Operation.kan(..))", throwing="error")//applying pointcut on before advice  
 public void myadvice5(JoinPoint jp,Throwable error)//it is advice (AfterThrowing advice)  
{  
	 System.out.println("additional concern");  
 System.out.println("Method Signature: "  + jp.getSignature());  
 System.out.println("Exception is: "+error);  
  System.out.println("end of after throwing advice...");  

 
}  
@Around("k3()")//applying pointcut on before advice  
 public Object myadvice3(ProceedingJoinPoint pjp) throws Throwable//it is advice (Around advice)  
{  
	System.out.println("Additional Concern Before calling actual method");  
 Object obj=pjp.proceed();  
 System.out.println("Additional Concern After calling actual method");  
  return obj;  

}  
@Before("k1()")//applying pointcut on before advice  
 public void myadvice1(JoinPoint jp)//it is advice (Before advice)  
{  
 System.out.println("additional concern1");  
  
}  
@After("k2()")//applying pointcut on before advice  
public void myadvice2(JoinPoint jp)//it is advice (After advice)  
{  
System.out.println("additional concern2");  
 
}  
}  

