package com.yy.design.behaviour.status;

import static com.yy.design.behaviour.status.State.*;

/**
 * @author gongcy
 * @date 2022/11/10 4:50 下午
 * @Description
 */
public class TableMarioStateMachine {

    private int score;
    private State currentState;

    private static final State[][] transitionTable = {
            {SUPER,CAPE,FIRE,SMALL},
            {SUPER,CAPE,FIRE,SMALL},
            {CAPE,CAPE,CAPE,SMALL},
            {FIRE,FIRE,FIRE,SMALL}
    };

    private static final int[][] actionTable = {
            {+100,+200,+300,+0},
            {+0,+200,+300,-100},
            {+0,+0,+0,-200},
            {+0,+0,+0,-300}
    };


}
