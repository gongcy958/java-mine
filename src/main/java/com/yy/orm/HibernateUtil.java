package com.yy.orm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * @author gongcy
 * @date 2022/12/20 11:36 上午
 * @Description
 */
public class HibernateUtil {

    /**
     * 若干POJO通过XML或者注解，直接映射到数据库表上
     * 映射规则配置文件 具体业务所需的xml 如 TRole.hbm.xml 操作t_role表的映射规则
     * hibernate全局配置文件 hibernate.cfg.xml 配置一些数据库信息啥的
     * 操作：生成全局SqlSessionFactory
     *
     * 优势：
     *
     * 1.消除代码映射规则，被分离到了xml或者注解中
     * 2.数据库连接也在xml中
     * 3.一个会话管理一个session对象
     * 4.关闭资源只需一个
     *
     * HQL操作POJO进而操作数据库
     *
     * 消除大量JDBC代码，提供级联、缓存、映射、一对多等功能。Hibernate是全表映射。
     *
     * 缺点：
     *
     * 年份表，要动态添加映射关系，需要破坏底层映射规则；
     * 全表映射带来不便，比如更新时需要发送所有字段
     * 无法根据条件组装不同的SQL
     * 对多表关联和复杂SQL查询功能支持较差
     * 不能有效支持存储过程
     * HQL性能较差
     */

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory();
        }catch (Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
