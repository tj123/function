package com.github.tj123.function;

import java.lang.annotation.*;


/**
 * 功能注解
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Function {

    /**
     * 功能列表
     */
	Class<? extends FunctionType<?>>[] value();

    /**
     * 功能模块
     */
    Class<? extends ModuleType> module() default DefaultModule.class;

}
