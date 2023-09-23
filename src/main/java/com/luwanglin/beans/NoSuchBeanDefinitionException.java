package com.luwanglin.beans;

/**
 * @author: luwanglin
 * @email: 1769862620@qq.com
 * @date: 9/23/23 4:21 PM
 * @description: 描述
 */
public class NoSuchBeanDefinitionException extends Exception{
    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }

    public NoSuchBeanDefinitionException() {
    }
}
