package com.yy.fielddriver.class01;

/**
 * @author gongcy
 * @date 2024/1/15 9:31 下午
 * @Description P20
 */
public interface ICustomer {

    void changePersonalName(String firstName, String lastName);
    void postalAddress(PostalAddress postalAddress);
    void relocateTo(PostalAddress postalAddress);
    void changeHomeTelephone(Telephone telephone);
    void disconnectTelephone();
    void changeMobileTelephone(Telephone telephone);
    void disconnectMobileTelephone();
    void primaryEmailAddress(EmailAddress emailAddress);
    void secondEmailAddress(EmailAddress emailAddress);
}
