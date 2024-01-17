package com.yy.fielddriver.class01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gongcy
 * @date 2024/1/13 10:01 下午
 * @Description P14
 */
@Service
public class FieldExtra {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public void saveCustomer(String customerId,String customerFirstName,String customerLastName,String streetAddress1,
                             String streetAddress2,String city,String stateOrProvince,String postalCode,String country,
                             String homePhone,String mobilePhone,String primaryEmailAddress,String secondEmailAddress) {
        Customer customer = customerDao.readCustomer(customerId);
        if (customer == null) {
            customer = new Customer();
            customer.setCustomerId(customerId);
        }
        customer.setCustomerFirstName(customerFirstName);
        customer.setCustomerLastName(customerLastName);
        customer.setStreetAddress1(streetAddress1);
        customer.setStreetAddress2(streetAddress2);
        customer.setCity(city);
        customer.setStateOrProvince(stateOrProvince);
        customer.setPostalCode(postalCode);
        customer.setCountry(country);
        customer.setHomePhone(homePhone);
        customer.setMobilePhone(mobilePhone);
        customer.setPrimaryEmailAddress(primaryEmailAddress);
        customer.setSecondEmailAddress(secondEmailAddress);

        customerDao.saveCustomer(customer);
    }

    @Transactional
    public void saveCustomer2(String customerId,String customerFirstName,String customerLastName,String streetAddress1,
                             String streetAddress2,String city,String stateOrProvince,String postalCode,String country,
                             String homePhone,String mobilePhone,String primaryEmailAddress,String secondEmailAddress) {
        Customer customer = customerDao.readCustomer(customerId);
        if (customer == null) {
            customer = new Customer();
            customer.setCustomerId(customerId);
        }
        if (customerFirstName != null) {
            customer.setCustomerFirstName(customerFirstName);
        }
        if (customerLastName != null) {
            customer.setCustomerLastName(customerLastName);
        }
        if (streetAddress1 != null) {
            customer.setStreetAddress1(streetAddress1);
        }
        if (streetAddress2 != null) {
            customer.setStreetAddress2(streetAddress2);
        }
        if (city != null) {
            customer.setCity(city);
        }
        if (stateOrProvince != null) {
            customer.setStateOrProvince(stateOrProvince);
        }
        if (postalCode != null) {
            customer.setPostalCode(postalCode);
        }
        if (country != null) {
            customer.setCountry(country);
        }
        if (homePhone != null) {
            customer.setHomePhone(homePhone);
        }
        if (mobilePhone != null) {
            customer.setMobilePhone(mobilePhone);
        }
        if (primaryEmailAddress != null) {
            customer.setPrimaryEmailAddress(primaryEmailAddress);
        }
        if (secondEmailAddress != null) {
            customer.setSecondEmailAddress(secondEmailAddress);
        }

        customerDao.saveCustomer(customer);
    }

    @Transactional
    public void changeCustomerPersonalName(String customerId, String customerFirstName, String customerLastName) {
        ICustomer customer = customerRepository.customerOfId(customerId);
        if (customer == null) {
            throw new IllegalStateException("Customer does not exist");
        }
        customer.changePersonalName(customerFirstName,customerLastName);
    }
}
