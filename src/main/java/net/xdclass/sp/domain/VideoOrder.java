package net.xdclass.sp.domain;

public class VideoOrder {

    private int id;
    //������
    private String outTradeNo;
    private Video video;

    public VideoOrder(Video video) {
       this.video=video;
    }
    public VideoOrder() {
        System.out.println("VideoOrder �չ��캯�� ������");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
//        System.out.println("VideoOrder setVideo���������� ");
        this.video = video;
    }
}
