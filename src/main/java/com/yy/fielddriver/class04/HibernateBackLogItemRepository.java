package com.yy.fielddriver.class04;

import com.yy.fielddriver.class01.BackLogItem;
import com.yy.fielddriver.class01.BackLogItemId;
import com.yy.fielddriver.class01.SprintId;
import com.yy.fielddriver.class02.Tenant;
import org.hibernate.Query;

import java.util.Collection;

/**
 * @author gongcy
 * @date 2024/1/16 9:51 下午
 * @Description
 */
public class HibernateBackLogItemRepository implements BackLogItemRepository{
    @Override
    public BackLogItem backLogItemOfId(TenantId tenantId, BackLogItemId backLogItemId) {
        return null;
    }

    @Override
    public Collection<BackLogItem> allBackLogItemsCommittedTo(Tenant aTenant, SprintId aSprintId) {
        // 创建Query
        // 设置参数
        // 执行查询
        return null;
    }
}
