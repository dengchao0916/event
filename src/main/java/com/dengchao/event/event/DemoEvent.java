package com.dengchao.event.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @Description :
 * @Author : dengchao
 * @Create : 2018/10/10
 */
public class DemoEvent extends ApplicationEvent {
    private String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
