package net.xdclass.sp.domain;

import java.util.List;
import java.util.Map;

public class Video {
    private int id;
    private String title;


    public Video(){

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
