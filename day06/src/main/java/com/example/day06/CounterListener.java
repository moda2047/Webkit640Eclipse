package com.example.day06;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CounterListener implements HttpSessionListener{
	@Override
    public void sessionCreated(HttpSessionEvent se) {
        // 세션 생성 시 호출되는 메서드
        System.out.println("새로운 세션이 생성되었습니다.");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // 세션 소멸 시 호출되는 메서드
        System.out.println("세션이 소멸되었습니다.");
    }

}
