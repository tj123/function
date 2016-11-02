package com.github.tj123.function;

/**
 * 功能的基类
 */
public interface FunctionType<P extends Enum<P> & ProjectType> {

    /**
     * 获取所属工程
     */
    P getProject();

    /**
     * 获取功能名
     */
    String getName();

    /**
     * 获取入口地址
     */
    String getEntry();
    
}
