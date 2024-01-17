package com.yy.design.behaviour.strategy;

/**
 * @author gongcy
 * @date 2023/12/14 11:27 上午
 * @Description
 */
public class MarioService {

    private int getScore(EventType eventType,int currScore,MarioType currState) {

        if (MarioType.SMALL.equals(currState)) {
            if (EventType.EAT_MUSHROOM.equals(eventType)) {
                currScore += 100;
            } else if (EventType.GET_CAPE.equals(eventType)) {
                currScore += 200;
            } else if (EventType.GET_FIRE.equals(eventType)) {
                currScore += 300;
            } else {
                System.out.println("小个子期间 不支持其他状态");
            }
        }

        if (MarioType.CAPE.equals(currState)) {
            if (EventType.MEET_MONSTER.equals(eventType)) {
                currScore -= 200;
            } else {
                System.out.println("持有斗篷期间 不支持其他状态");
            }
        }

        if (MarioType.FIRE.equals(currState)) {
            if (EventType.MEET_MONSTER.equals(eventType)) {
                currScore -= 300;
            } else {
                System.out.println("获得火焰期间 不支持其他状态");
            }
        }

        if (MarioType.SUPER.equals(currState)) {
            if (EventType.GET_CAPE.equals(eventType)) {
                currScore += 200;
            } else if (EventType.GET_FIRE.equals(eventType)) {
                currScore += 300;
            } else if (EventType.MEET_MONSTER.equals(eventType)) {
                currScore -= 100;
            } else {
                System.out.println("Super期间 不支持其他状态");
            }
        }

        return currScore;
    }

    private MarioType getState(Mario mario) {

        return null;
    }
}
