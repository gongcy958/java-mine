package algorithm.slidewindow;

import java.util.HashMap;

/**
 * @author gongcy
 * @date 2023/5/23 10:29 下午
 * @Description
 */
public class SlideWindowDemo {

    public void template(String s) {

        // 用合适的数据结构记录窗口中的数据
        HashMap<Character,Integer> window = new HashMap<>();

        int left = 0,right = 0;
        while (right < s.length()) {
            // 取最右侧窗口的字符
            Character c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0) + 1);

            // 增大窗口
            right++;

            // 进行窗口内一系列更新

            // 判断左侧窗口是否要收缩
            while (left < right) {
                Character d = s.charAt(left);
                window.remove(d);
                // 缩小窗口
                left++;
                // 进行窗口内的一系列更新
            }
        }
    }
}
