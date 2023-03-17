package com.yy.template;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author gongcy
 * @date 2023/3/16 10:18 下午
 * @Description
 */
public class Twitter {

    private static int timestamp = 0;

    private static class Tweet {
        private int id;
        private int time;
        private Tweet next;

        public Tweet(int id, int time) {
            this.id = id;
            this.time = time;
            this.next = null;
        }
    }

    class User {
        private int id;
        public Set<Integer> followed;
        // 用户发表的推文链表头结点
        public Tweet head;

        public User(int userId) {
            followed = new HashSet<>();
            this.id = userId;
            this.head = null;
            // 关注一下自己
            follow(id);
        }

        public void follow(int userId) {
            followed.add(userId);
        }

        public void unfollow(int userId) {
            // 不可以取关自己
            if (userId != this.id)
                followed.remove(userId);
        }

        public void post(int tweetId) {
            Tweet twt = new Tweet(tweetId, timestamp);
            timestamp++;
            // 将新建的推文插入链表头
            // 越靠前的推文 time 值越大
            twt.next = head;
            head = twt;
        }
    }





    // user 发一条推特动态
    public void postTwitter(int userId, int twitterId) {

    }

    // 返回该user关注的人 包括他自己最近的10条动态 id 最多10条 时间线从新到旧
    public List<Integer> getNewsFeed(int userId) {
        return null;
    }

    // 关注
    public void follow(int followId, int followeeId) {

    }

    // 取关
    public void unfollow(int followId, int followeeId) {

    }
}
