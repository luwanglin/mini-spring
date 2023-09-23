package com.luwanglin.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: luwanglin
 * @email: 1769862620@qq.com
 * @date: 9/23/23 4:47 PM
 * @description: 描述
 */
public class SimpleBeanFactory implements BeanFactory{
    private List<BeanDefinition> beanDefinitionList = new ArrayList<>();
    private List<String> beanNameList = new ArrayList<>();
    private Map<String, Object> singletonMap = new ConcurrentHashMap<>();

    public SimpleBeanFactory() {
    }

    @Override
    public Object getBean(String beanName) throws NoSuchBeanDefinitionException {
        Object singleton = singletonMap.get(beanName);
        if (null == singleton) {
            int i = beanNameList.indexOf(beanName);
            if (-1 == i) {
                throw new NoSuchBeanDefinitionException();
            } else {
                BeanDefinition beanDefinition = beanDefinitionList.get(i);
                try {
                    singleton = Class.forName(beanDefinition.getClassName()).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                singletonMap.put(beanDefinition.getId(), singleton);
            }
        }
        return singleton;
    }

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
        this.beanNameList.add(beanDefinition.getId());
        this.beanDefinitionList.add(beanDefinition);
    }
}
