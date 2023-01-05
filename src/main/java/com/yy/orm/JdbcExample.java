package com.yy.orm;


import java.sql.*;

/**
 * @author gongcy
 * @date 2022/12/20 10:36 上午
 * @Description JDBC操作示例
 */
public class JdbcExample {

    /**
     * 1.连接数据库、注册驱动和数据库信息
     * 2.操作Connection，打开Statement对象
     * 3.通过Statement对象操作SQL，返回结果到ResultSet对象
     * 4.使用ResultSet读取数据，通过代码转换为具体的POJO对象
     * 5.关闭数据库相关资源
     *
     * 传统JDBC弊端： 工作量大 先连接、然后处理JDBC底层事物，处理数据类型，还需要操作Connection对象、Statement对象和ResultSet对象拿数据
     *
     * 处理异常和正确关闭资源问题
     * 简单SQL处理流程长且复杂
     *
     * 新的ORM模型出现，底层都是基于JDBC的封装
     *
     * ORM 对象关系映射
     * ORM模型 数据库表和简单Java对象的映射关系模型 通过配置将数据库表数据转换为POJO对象，拿来即用。
     *
     * SUN公司推出JavaEE服务器组建模型EJB 配置复杂、适用范围小 -> 淘汰
     *
     * 随之而来的框架 Hibernate
     */

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://101.201.209.152:3306/mybatis";
            String user = "root";
            String password = "woaiwojia0425";
            connection = DriverManager.getConnection(url,user,password);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }

        return connection;
    }

    public Role getRole(Long id) {
        Connection connection = getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement("select id,role_name,note from t_role where id = ?");
            ps.setLong(1,id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Long roleId = rs.getLong("id");
                String userName = rs.getString("role_name");
                String note = rs.getString("note");
                Role role = new Role();
                role.setId(id);
                role.setRoleName(userName);
                role.setNote(note);
                return role;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally {
            this.close(rs,ps,connection);
        }

        return null;
    }

    private void close(ResultSet rs, Statement stmt, Connection connection) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JdbcExample example = new JdbcExample();
        Role role = example.getRole(1L);
        System.out.println("从数据库获取的数据是: " + role);
    }


}
