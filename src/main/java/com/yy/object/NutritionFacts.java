package com.yy.object;

/**
 * @author gongcy
 * @date 2022/12/4 4:01 下午
 * @Description
 */
public class NutritionFacts {

    private final int servingSize; // required
    private final int servings; // required

    private final int calories; // optional
    private final int fat; // optional
    private final int sodium; // optional
    private final int carbohydrate; // optional

    // 两个必填参数
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize,servings,0);
    }

    // 两个必填参数 + 一个可选参数
    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize,servings,calories,0);
    }

    // 两个必填参数 + 两个可选参数
    public NutritionFacts(int servingSize, int servings, int calories,int fat) {
        this(servingSize,servings,calories,fat,0);
    }

    // 两个必填参数 + 三个可选参数
    public NutritionFacts(int servingSize, int servings, int calories,int fat,int sodium) {
        this(servingSize,servings,calories,fat,sodium,0);
    }

    // 两个必填参数 + 四个可选参数 即所有参数
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
