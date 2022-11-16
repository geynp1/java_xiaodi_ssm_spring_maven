package net.xdclass.sp.aop;

import java.time.LocalTime;
//横切关注点
public class TimeHandler {
    public void printBefore(){
        System.out.println("printBefore 日志 time= "+ LocalTime.now().toString());
    }

    public void printAfter(){
        System.out.println("printAfter 日志 time= "+ LocalTime.now().toString());
    }
}
