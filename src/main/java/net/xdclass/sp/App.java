package net.xdclass.sp;


import net.xdclass.sp.domain.Video;
import net.xdclass.sp.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //ɨ��ָ���İ�,�����Ӱ�
        context.scan("net.xdclass");

        //������ɳ�ʼ�����������ķ���
        context.refresh();

        VideoService videoService = (VideoService)context.getBean("videoService");
        videoService.findById(1);

        Video video = (Video) context.getBean("video");
        video.init();

    }



}
