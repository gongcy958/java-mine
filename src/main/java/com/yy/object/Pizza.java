package com.yy.object;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author gongcy
 * @date 2022/12/4 5:34 下午
 * @Description
 */
public abstract class Pizza {

    public enum Topping {
        HAM,MUSHROOM,ONION,PEPPER,SAUSAGE
    }

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        // see Item 50
        toppings = builder.toppings.clone();
    }

}
