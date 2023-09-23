package com.luwanglin.beans;

import lombok.Data;

/**
 * @author: luwanglin
 * @email: 1769862620@qq.com
 * @date: 9/23/23 3:58 PM
 * @description: 描述
 */
@Data
public class BeanDefinition {
    private String id;
    private String className;

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }
}
