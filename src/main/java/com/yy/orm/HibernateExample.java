package com.yy.orm;


import org.hibernate.classic.Session;

/**
 * @author gongcy
 * @date 2022/12/20 11:48 上午
 * @Description
 */
public class HibernateExample {

    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Role role = (Role) session.get(Role.class,1L);
            System.out.println(role.getRoleName());
        }finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
