package com.yy.design.create.prototype;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gongcy
 * @date 2022/11/1 3:53 下午
 * @Description
 */
public class Demo {

    private ConcurrentHashMap<String,SearchWord> currentKeywords = new ConcurrentHashMap<>();
    private long lastUpdateTime;

    public void refresh() {
        // from db
        List<SearchWord> words = getSearchWords(lastUpdateTime);
        if (words == null || words.size() == 0) {
            return;
        }
        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : words) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }

            if (currentKeywords.containsKey(searchWord.getKeyWords())) {
                currentKeywords.replace(searchWord.getKeyWords(),searchWord);
            }else {
                currentKeywords.put(searchWord.getKeyWords(),searchWord);
            }
        }

        lastUpdateTime = maxNewUpdatedTime;

    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // do something..
        // 伪代码
        return null;
    }

}
