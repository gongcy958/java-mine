package com.yy.fielddriver.class01;

import org.springframework.stereotype.Repository;

/**
 * @author gongcy
 * @date 2024/1/15 10:26 下午
 * @Description
 */
@Repository
public interface CustomerRepository {


    ICustomer customerOfId(String customerId);
}
