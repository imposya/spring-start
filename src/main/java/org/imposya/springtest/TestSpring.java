package org.imposya.springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(mp.getVolume());
        System.out.println(mp.getName());
        context.close();
    }
}
