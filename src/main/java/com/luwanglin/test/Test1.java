package com.luwanglin.test;

import com.luwanglin.beans.NoSuchBeanDefinitionException;
import com.luwanglin.context.ClassPathXmlApplicationContext;

/**
 * @author: luwanglin
 * @email: 1769862620@qq.com
 * @date: 9/23/23 4:13 PM
 * @description: 描述
 */
public class Test1 {
    public static void main(String[] args) throws NoSuchBeanDefinitionException {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans-luwanglin.xml");
        AService aService = (AService) xmlApplicationContext.getBean("aService");
        aService.sayHello();
    }
}
