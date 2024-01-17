package com.yy.fielddriver.class01;

import org.springframework.stereotype.Repository;

/**
 * @author gongcy
 * @date 2024/1/13 10:07 下午
 * @Description
 */
@Repository
public interface CustomerDao {


    Customer readCustomer(String customerId);

    void saveCustomer(Customer customer);
}
