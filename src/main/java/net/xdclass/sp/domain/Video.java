package net.xdclass.sp.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class Video {
    private int id;

    private String title;


    public void init(){
        System.out.println("video��init����������");
    }


    public void destroy(){
        System.out.println("video��destroy����������");
    }
    public Video(){
        System.out.println("video �չ��캯��������");
    }
    public Video(String title){
//        System.out.println("video ���ι��캯��������");
        this.title=title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
//        System.out.println("Video setId����������");

        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
//        System.out.println("Video setTitle����������");
        this.title = title;
    }
}
