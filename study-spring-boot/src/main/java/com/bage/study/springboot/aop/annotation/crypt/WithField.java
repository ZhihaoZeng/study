package com.bage.study.springboot.aop.annotation.crypt;


import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface WithField {

}
