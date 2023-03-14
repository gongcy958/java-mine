package com.yy.template;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gongcy
 * @date 2023/3/13 12:22 下午
 * @Description
 */
public class LockTemplate {

    // 将s[j]向上波动一次
    String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '9') {
            ch[j] = '0';
        }else {
            ch[j] += 1;
        }
        return new String(ch);
    }

    // 将s[j]向下波动一次
    String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '0') {
            ch[j] = '9';
        }else {
            ch[j] -= 1;
        }
        return new String(ch);
    }

    void BFS(String target) {
        Queue<String> q = new LinkedList<>();
        q.offer("0000");

        while (!q.isEmpty()) {
            int sz = q.size();

            // 将当前队列中的所有节点向四周扩散
            for (int i = 0; i < sz; i++) {
                String curr = q.poll();

                System.out.println(curr);

                // 将一个节点的相邻节点加入队列
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(curr,j);
                    String down = minusOne(curr,j);
                    q.offer(up);
                    q.offer(down);
                }
            }

        }

        return;
    }


}
