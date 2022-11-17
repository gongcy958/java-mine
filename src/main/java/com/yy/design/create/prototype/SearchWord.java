package com.yy.design.create.prototype;

/**
 * @author gongcy
 * @date 2022/11/1 3:55 下午
 * @Description
 */
public class SearchWord {

    private long lastUpdateTime;
    private String keyWords;

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
