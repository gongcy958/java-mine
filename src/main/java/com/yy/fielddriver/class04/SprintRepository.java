package com.yy.fielddriver.class04;

import com.yy.fielddriver.class01.SprintId;
import org.springframework.stereotype.Repository;

/**
 * @author gongcy
 * @date 2024/1/16 9:48 下午
 * @Description
 */
@Repository
public interface SprintRepository {
    Sprint sprintOfId(TenantId tenantId, SprintId sprintId);
}
