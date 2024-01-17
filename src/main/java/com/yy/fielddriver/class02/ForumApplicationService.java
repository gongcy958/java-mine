package com.yy.fielddriver.class02;

import com.yy.fielddriver.class01.BackLogItem;
import com.yy.fielddriver.class01.BackLogItemId;
import com.yy.fielddriver.class01.SprintId;
import com.yy.fielddriver.class04.BackLogItemRepository;
import com.yy.fielddriver.class04.Sprint;
import com.yy.fielddriver.class04.SprintRepository;
import com.yy.fielddriver.class04.TenantId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gongcy
 * @date 2024/1/16 9:29 下午
 * @Description
 */
@Service
public class ForumApplicationService {

    @Autowired
    private BackLogItemRepository backLogItemRepository;

    @Autowired
    private SprintRepository sprintRepository;

    @Transactional
    public Discussion startDiscussion(String aTenantId, String aUsername, String aForumId, String aSubject) {
        Tenant tenant = new Tenant(aTenantId);
        ForumId forumId = new ForumId(aForumId);
        Forum forum = this.forum(tenant,aForumId);
        if (forum == null) {
            throw new IllegalStateException("Forum does not exist..");
        }
        // 省略一堆逻辑..
        return null;
    }

    private Forum forum(Tenant tenant, String aForumId) {
        return null;
    }

    @Transactional
    public void commitBackLogItemToSprint(String aTenantId, String aBackLogItemId, String aSprintId) {
        TenantId tenantId = new TenantId(aTenantId);
        BackLogItem backLogItem = backLogItemRepository.backLogItemOfId(tenantId,new BackLogItemId(aBackLogItemId));
        Sprint sprint = sprintRepository.sprintOfId(tenantId,new SprintId(aSprintId));
        backLogItem.commitTo(null);
    }
}
