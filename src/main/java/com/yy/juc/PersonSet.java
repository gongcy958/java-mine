package com.yy.juc;

import com.yy.object.Person;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gongcy
 * @date 2023/1/2 5:44 下午
 * @Description
 */
public class PersonSet {

    private final Set<Person> mySet = new HashSet<>();

    public synchronized void addPerson(Person p) {
        mySet.add(p);
    }

    public synchronized boolean containsPerson(Person p){
        return mySet.contains(p);
    }
}
