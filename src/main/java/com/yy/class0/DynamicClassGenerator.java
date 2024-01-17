package com.yy.class0;

/**
 * @author gongcy
 * @date 2023/7/21 4:47 下午
 * @Description
 */
public class DynamicClassGenerator {

    private String addr;
    private Object[] elementData;

    private class NamePolicy{

        private void processAddr() {
            String result = addr;
            System.out.println(result);

            Object[] elementData = DynamicClassGenerator.this.elementData;
            System.out.println(elementData);
        }
    }
}
