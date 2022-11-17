package com.yy.design.behaviour.visit;

/**
 * @author gongcy
 * @date 2022/11/10 4:10 下午
 * @Description
 */
public interface IResource {

    void accept(Visitor visitor);
}
