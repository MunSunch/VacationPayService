package com.munsun.vacation_service.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
@Aspect
@Component
public class VacationPayControllerAspect {
    @Pointcut("execution(* *(..))")
    private void executionMethods() {}

    @Pointcut("within(com.munsun.vacation_service.controllers.VacationPayController)")
    private void inVacationPayControllerClass() {}

    @Before("inVacationPayControllerClass() & executionMethods()")
    public void loggingEndpoint(JoinPoint point) throws Throwable {
        var signature = point.getSignature().toShortString();
        var args = Arrays.stream(point.getArgs())
                .map(String::valueOf)
                .collect(Collectors.toList());
        log.info("execution " + signature + " with args=" + args);
    }
}
