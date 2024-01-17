package com.yy.fielddriver.class02;

import org.springframework.stereotype.Repository;

/**
 * @author gongcy
 * @date 2024/1/16 9:15 下午
 * @Description
 */
@Repository
public interface UserRepository {
    User userFor(Object tenantId, String aUsername);
}
