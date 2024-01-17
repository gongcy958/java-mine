package com.yy.fielddriver.class02;

import com.yy.fielddriver.class01.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @author gongcy
 * @date 2024/1/16 9:11 下午
 * @Description
 */
@Service
public class Forum extends Entity {

    @Autowired
    private UserRepository userRepository;

    public Discussion startDiscussion(String aUsername,String aSubject) {
        if (this.isClosed()) {
            throw new IllegalStateException("Forum is closed.");
        }
        User user = userRepository.userFor(this.tenantId(),aUsername);
        if (!user.hasPermissionTo()) {
            throw new IllegalStateException("");
        }

        String authorUser = user.userName();
        String authorName = user.person().name();
        String emailAddress = user.person().emailAddress();

        Discussion discussion = new Discussion(
                this.toString(),this.forumId(),
                authorUser,authorName,emailAddress,
                aSubject
        );
        return discussion;
    }

    private Object forumId() {
        return null;
    }

    private Object tenantId() {
        return null;
    }

    private boolean isClosed() {
        return false;
    }
}
