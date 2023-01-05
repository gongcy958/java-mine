package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/4 5:57 下午
 * @Description
 */
public class Calzone extends Pizza{

    private final boolean sauceInside;



    public static class Builder extends Pizza.Builder<Builder> {

        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

}
