package com.yy.function.lambda;

/**
 * @author gongcy
 * @date 2023/7/3 8:22 下午
 * @Description
 */
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            myThrowException();

        } catch (RuntimeException rx){
            rx.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void myThrowException() {

    }
}
