package com.yy.fielddriver.class04;

import com.yy.fielddriver.class01.BackLogItem;
import com.yy.fielddriver.class01.BackLogItemId;
import com.yy.fielddriver.class01.SprintId;
import com.yy.fielddriver.class02.Tenant;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author gongcy
 * @date 2024/1/16 9:46 下午
 * @Description
 */
@Repository
public interface BackLogItemRepository {
    BackLogItem backLogItemOfId(TenantId tenantId, BackLogItemId backLogItemId);
    Collection<BackLogItem> allBackLogItemsCommittedTo(Tenant aTenant, SprintId aSprintId);
}
