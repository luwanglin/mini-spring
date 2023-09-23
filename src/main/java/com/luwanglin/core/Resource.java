package com.luwanglin.core;

import java.util.Iterator;

/**
 * @author: luwanglin
 * @email: 1769862620@qq.com
 * @date: 9/23/23 4:26 PM
 * @description: 描述
 *
 * Iterator和Iterable是Java中用于遍历集合的两个接口。
 *
 * Iterator接口用于遍历集合中的元素。它提供了一种顺序访问集合中元素的方式，可以判断集合中是否还有下一个元素，以及获取下一个元素。Iterator接口的常用方法包括hasNext()用于判断是否还有下一个元素，next()用于获取下一个元素，remove()用于删除当前元素。
 *
 * Iterable接口是一个标记接口，表示实现了该接口的类可以被迭代。它提供了一个iterator()方法，用于返回一个Iterator对象，从而实现对集合的迭代。实现了Iterable接口的类可以使用增强for循环来遍历集合中的元素。
 *
 * 总结起来，Iterator是用于遍历集合的接口，而Iterable是一个标记接口，表示实现了该接口的类可以被迭代。在使用增强for循环遍历集合时，实际上是通过调用Iterable接口的iterator()方法获取一个Iterator对象，然后使用Iterator对象进行遍历。
 */
public interface Resource extends Iterator<Object> {
}
