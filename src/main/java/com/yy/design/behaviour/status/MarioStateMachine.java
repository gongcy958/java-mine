package com.yy.design.behaviour.status;

/**
 * @author gongcy
 * @date 2022/11/10 4:33 下午
 * @Description
 */
public class MarioStateMachine {

    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom(){

        // ..

//        System.out.println("吃蘑菇");
//        System.out.println("变大");
//        System.out.println("积分+100");

        if (currentState.equals(State.SMALL)) {
            this.currentState = State.SUPER;
            this.score += 100;
        }
    }

    public void obtainCape() {

        // ..

//        System.out.println("获得斗篷");
//        System.out.println("积分+200");

        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            this.currentState = State.CAPE;
            this.score += 200;
        }
    }

    public void obtainFireFlower() {

        // ..

//        System.out.println("获得火焰");
//        System.out.println("积分+400");

        if (currentState.equals(State.SMALL) || currentState.equals(State.SUPER)) {
            this.currentState = State.FIRE;
            this.score += 300;
        }

    }

    public void meetMonster() {

        // ..

//        System.out.println("遇到怪物");
//        System.out.println("变小");
//        System.out.println("积分-200");

        if (currentState.equals(State.SUPER)) {
            this.currentState = State.SMALL;
            this.score -= 100;
            return;
        }

        if (currentState.equals(State.CAPE)) {
            this.currentState = State.SMALL;
            this.score -= 200;
            return;
        }

        if (currentState.equals(State.FIRE)) {
            this.currentState = State.SMALL;
            this.score -= 300;
            return;
        }

        if (currentState.equals(State.SMALL)) {
            this.score -= 400;
            System.out.println("Game Out");
        }
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }


}
