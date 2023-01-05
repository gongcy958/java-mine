package com.yy.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author gongcy
 * @date 2022/11/29 11:16 上午
 * @Description
 */
public class Favorites {

    private Map<Class<?>,Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type),instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
