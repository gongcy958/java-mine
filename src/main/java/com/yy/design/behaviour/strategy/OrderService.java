package com.yy.design.behaviour.strategy;

/**
 * @author gongcy
 * @date 2023/12/12 5:13 下午
 * @Description
 */
public class OrderService {

    /**
     * 常规模式
     * @param order
     * @return
     */
//    public double discount(Order order) {
//        double discount = 0.0;
//        OrderType type = order.getType();
//        if (type.equals(OrderType.NORMAL)) {
//            System.out.println("计算普通订单的折扣");
//        } else if (type.equals(OrderType.GROUPON)) {
//            System.out.println("计算团购订单的折扣");
//        } else if (type.equals(OrderType.PROMOTION)) {
//            System.out.println("计算促销订单的折扣");
//        } else {
//            System.out.println("不支持");
//        }
//
//        return discount;
//    }

    public static double discount(Order order) {
        double discount = 0.0;
        OrderType type = order.getType();
        OrderStrategy strategy = OrderFactory.getStrategy(type);
        double discount1 = strategy.discount(type);
        return discount1;
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.setType(OrderType.GROUPON);
        discount(order);
    }
}
