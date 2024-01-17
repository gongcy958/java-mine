package com.yy.fielddriver.class05;

import java.io.Serializable;

/**
 * @author gongcy
 * @date 2024/1/17 9:19 下午
 * @Description
 */
public class IdentifiedDomainObject implements Serializable {

    private long id = -1;

    public IdentifiedDomainObject() {
        super();
    }

    protected long id() {
        return this.id;
    }

    protected void setId(long anId) {
        this.id = anId;
    }
}
