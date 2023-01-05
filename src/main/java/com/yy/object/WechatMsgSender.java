package com.yy.object;

import java.util.List;

/**
 * @author gongcy
 * @date 2022/12/7 4:44 下午
 * @Description
 */
public class WechatMsgSender implements MsgSender{

    private List<String> wechatIds;

    public WechatMsgSender(List<String> wechatIds) {
        this.wechatIds = wechatIds;
    }

    @Override
    public void send(String message) {
        System.out.println("发送微信消息");
    }
}
