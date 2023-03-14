package com.yy.basic.function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author gongcy
 * @date 2023/2/27 6:59 下午
 * @Description
 */
public class FastDemo {

    public static void main(String[] args) {
        String wechat = "mine";
        String introduce = "每日更新技术文章";
        String mine = wechat + "," + introduce;

        wechat.concat(",java");

        System.out.println(mine);

//      I

    }
}
