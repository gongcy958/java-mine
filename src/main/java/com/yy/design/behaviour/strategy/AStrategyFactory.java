package com.yy.design.behaviour.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gongcy
 * @date 2023/12/12 5:04 下午
 * @Description
 */
public class AStrategyFactory {

    private static final Map<String,AStrategy> factories = new HashMap<>();

    static {
        factories.put("A",new ConcreteStrategyA());
        factories.put("B",new ConcreteStrategyB());
    }

    public static AStrategy getStrategy(String type){
        if (type == null || type.isEmpty()) {
            return null;
        }

        return factories.get(type);
    }
}
