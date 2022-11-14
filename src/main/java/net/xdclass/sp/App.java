package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.Video2;
import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        testScope(context);
//        testInject(context);
//        testInjectCollection(context);
        testInjecta(context);

    }


    private static void testInjecta(ApplicationContext context) {
        Video video = (Video)context.getBean("video");
        System.out.println(video.getTitle());

        Video2 video2 = (Video2)context.getBean("video2");
        System.out.println(video2.getSummary());

    }

    private static void testInjectCollection(ApplicationContext context) {
        Video video = (Video) context.getBean("video");
//        System.out.println(video.getChapterList().toString());
//        System.out.println(video.getVideoMap().values().toString());
    }
    private static void testInject(ApplicationContext context) {
        Video video = (Video)context.getBean("video");
        System.out.println(video.getTitle());

        VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrder");
        System.out.println(videoOrder.getVideo().getTitle());
    }

    private static void testScope(ApplicationContext context){
        Video video1 = (Video)context.getBean("video");
        Video video2 = (Video)context.getBean("video");
        //øø∆•≈‰ƒ⁄¥Êµÿ÷∑£¨ ==  «∆•≈‰ƒ⁄¥Êµÿ÷∑
        System.out.println(video1==video2);
    }
}
