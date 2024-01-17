package com.yy.design.behaviour.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gongcy
 * @date 2023/12/12 5:23 下午
 * @Description
 */
public class OrderFactory {

    private static final Map<OrderType,OrderStrategy> factories = new HashMap<>();

    static {
        factories.put(OrderType.NORMAL,new NormalOrderStrategy());
        factories.put(OrderType.GROUPON,new GrouponOrderStrategy());
        factories.put(OrderType.PROMOTION,new PromotionOrderStrategy());
    }

    public static OrderStrategy getStrategy(OrderType type) {
        if (type == null) {
            return null;
        }

        return factories.get(type);
    }
}
