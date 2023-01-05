package com.yy.object;

import java.util.Objects;

/**
 * @author gongcy
 * @date 2022/12/4 5:50 下午
 * @Description
 */
public class NyPizza extends Pizza{

    public enum Size{SMALL,MEDIUM,LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
