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
        System.out.println("video ���ι��캯��������");
        this.title=title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Video setId����������");

        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("Video setTitle����������");
        this.title = title;
    }
}
