package net.xdclass.sp.aop;

import java.time.LocalTime;
//���й�ע��
public class TimeHandler {
    public void printBefore(){
        System.out.println("printBefore ��־ time= "+ LocalTime.now().toString());
    }

    public void printAfter(){
        System.out.println("printAfter ��־ time= "+ LocalTime.now().toString());
    }
}
