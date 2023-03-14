package com.yy.design.structure.proxy;

/**
 * @author gongcy
 * @date 2023/2/17 3:03 下午
 * @Description
 */
public interface IUserController {

    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}
