package com.yy.effective;

/**
 * @author gongcy
 * @date 2023/10/9 9:17 下午
 * @Description
 */
public class IntEnum {

    /**
     * 1.int 枚举模式
     * 2.构建一个真实的案例场景
     * 3.缺点
     *
     * 不具备类型安全性：这体现在需要Orange元素的地方传了Apple，编译器也不会报错。
     * 几乎没有描述性：我觉得这个问题不是很成立，命名合适还是有的
     */

    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;


}
