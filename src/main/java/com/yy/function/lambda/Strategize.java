package com.yy.function.lambda;

/**
 * @author gongcy
 * @date 2022/11/2 6:02 下午
 * @Description
 */
public class Strategize {

    Strategy strategy;
    String msg;
    Strategize(String msg) {
        strategy = new Soft(); // [1]
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }
    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
            new Strategy() {
                @Override
                public String approach(String msg) {
                    return msg.toUpperCase() + "!";
                }
            },
            msg -> msg.substring(0,5),
            Unrelated::twice
        };

        Strategize s = new Strategize("Hello there");
        s.communicate();

        for (Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy);
            s.communicate();
        }

        System.out.println(strategies);
    }
}
