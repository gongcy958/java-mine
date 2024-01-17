package com.yy.design.behaviour.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongcy
 * @date 2023/9/11 3:03 下午
 * @Description
 */
@RestController
@RequestMapping(value = "/new")
public class NewcomersController {

    @Autowired
    private NewcomersService newcomersService;

    @Autowired
    private PromotionService promotionService;


    @RequestMapping(value = "/money")
    public Long bone(@RequestParam String password,@RequestParam String phone) {

        long userId = newcomersService.registry(password,phone);
        promotionService.issueNewcomersExperienceCash(userId);
        return userId;
    }


}
