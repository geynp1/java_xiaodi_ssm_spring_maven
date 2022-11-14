package net.xdclass.sp.domain;

public class Video2 {
    private int id;
    private String title;
    private String summary;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Video2(){

    }
    public Video2(String title){
        System.out.println("video 带参构造函数被调用");
        this.title=title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Video setId方法被调用");

        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("Video setTitle方法被调用");
        this.title = title;
    }
}
