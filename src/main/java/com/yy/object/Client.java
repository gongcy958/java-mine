package com.yy.object;

import java.math.BigInteger;
import java.sql.*;
import java.util.*;

/**
 * @author gongcy
 * @date 2022/12/3 11:42 上午
 * @Description
 */
public class Client {

    public static void main(String[] args) throws SQLException {

        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://101.201.209.152:3306/test";

        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "woaiwojia0425");

        Connection conn = driver.connect(url, info);
        System.out.println(conn);
    }
}
