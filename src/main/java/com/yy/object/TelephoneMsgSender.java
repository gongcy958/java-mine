package com.yy.object;

import java.util.List;

/**
 * @author gongcy
 * @date 2022/12/7 4:41 下午
 * @Description
 */
public class TelephoneMsgSender implements MsgSender{

    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        System.out.println("发送语音电话");
    }
}
