package com.yy.io;

import java.util.Objects;

/**
 * @author gongcy
 * @date 2022/12/16 3:00 下午
 * @Description
 */
public final class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {

        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);

    }
}
