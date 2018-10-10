package com.dengchao.event.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Description :
 * @Author : dengchao
 * @Create : 2018/10/10
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    @Async
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("监听："+demoEvent.getMsg());
        System.out.println("事件sources："+demoEvent.getSource());
        System.out.println("事件Timestamp："+demoEvent.getTimestamp());
    }
}
