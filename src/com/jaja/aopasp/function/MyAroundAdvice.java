package com.jaja.aopasp.function;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前增强...");
        Object result = methodInvocation.proceed();// 执行目标对象的方法
        System.out.println("环绕后增强...");
        return result;
    }
}
