package com.yy.structure;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author gongcy
 * @date 2023/7/17 8:57 下午
 * @Description
 */
@FunctionalInterface
public interface PredicateInterface<T> {

    boolean test(T t);

    default PredicateInterface<T> and(PredicateInterface<? super T> other) {
        Objects.requireNonNull(other);
        return t -> test(t) && other.test(t);
    }
}