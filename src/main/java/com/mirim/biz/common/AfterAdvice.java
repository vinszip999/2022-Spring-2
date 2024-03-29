package com.mirim.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {

    @After("PointcutCommon.allPointcut()")
    public void finallyLog(){
        System.out.println("[사후처리] 무조건 동작");
    }
}
