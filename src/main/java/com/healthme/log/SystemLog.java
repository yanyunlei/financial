package com.healthme.log;

import java.lang.annotation.*;

/**
 * @author root
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {
    String event() default "";
}
