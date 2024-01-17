package com.yy.fielddriver.class01;

/**
 * @author gongcy
 * @date 2024/1/15 10:35 下午
 * @Description
 */
public class BackLogItem extends Entity{

    private SprintId sprintId;
    private BacklogItemStatusType status;

    private BackLogItemId backLogItemId;
    private BusinessPriority businessPriority;

//    public void setSprintId(SprintId sprintId) {
//        this.sprintId = sprintId;
//    }
//
//    public void setStatus(BacklogItemStatusType status){
//        this.status = status;
//    }

    public void commitTo(SprintId sprintId) {
        if (!this.isScheduledForRelease()) {
            throw new IllegalStateException("Must be scheduled for release to commit to sprint.");
        }
        if (this.isCommittedToSprint()) {
            if (!sprintId.equals(this.sprintId)) {
                this.uncommitFromSprint();
            }
        }

        this.elevateStatusWith(BacklogItemStatusType.COMMITTED);
        this.setSprintId(sprintId);
        // ...
    }

    private void setSprintId(SprintId sprintId) {

    }

    private void elevateStatusWith(BacklogItemStatusType committed) {

    }

    private void uncommitFromSprint() {

    }

    private boolean isCommittedToSprint() {
        return true;
    }

    private boolean isScheduledForRelease() {
        return false;
    }

}
