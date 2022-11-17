package com.yy.design.behaviour.status;

/**
 * @author gongcy
 * @date 2022/11/10 4:38 下午
 * @Description
 */
public class StateMachineMain {

    public static void main(String[] args) {

        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();


    }
}
