package net.xdclass.sp.service;

import net.xdclass.sp.domain.Video;
import org.springframework.stereotype.Component;

@Component("videoService")
public class VideoServiceImpl implements VideoService{

    @Override
    public int save(Video video) {
        System.out.println("����video");
        return 1;
    }

    @Override
    public Video findById(int id) {
        System.out.println("����id����Ƶ");
        return new Video();
    }
}
