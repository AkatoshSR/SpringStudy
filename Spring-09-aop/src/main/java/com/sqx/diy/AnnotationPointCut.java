package com.sqx.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 使用注解方式实现AOP
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.sqx.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("使用注解方式实现：方法执行前");
    }

    @After("execution(* com.sqx.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("使用注解方式实现：方法执行后");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.sqx.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        // 执行方法前的方法
        System.out.println("环绕增强：环绕前的方法");

        // 测试：在执行方法前
        Signature signature = jp.getSignature();
        System.out.println("执行方法前：" + signature);

        // 被环绕对象，执行方法
        Object proceed = jp.proceed();

        // 执行方法后的方法
        System.out.println("环绕增强：环绕后的方法");

        System.out.println(proceed);


    }

}
