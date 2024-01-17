package com.yy.fielddriver.class01;

/**
 * @author gongcy
 * @date 2024/1/15 10:46 下午
 * @Description
 */
public class BackLogDemo {

    public void test() {
        BackLogItem backLogItem = new BackLogItem();
//        backLogItem.setSprintId(new SprintId());
//        backLogItem.setStatus(BacklogItemStatusType.COMMITTED);
        backLogItem.commitTo(new SprintId());
    }
}
