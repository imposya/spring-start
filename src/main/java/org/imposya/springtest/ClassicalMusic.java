package org.imposya.springtest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("init classical");
    }

    public void destroy() {
        System.out.println("destroy classical");
    }
    @Override
    public List<String> getSong() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("song1rock");
        arrayList.add("song2rock");
        arrayList.add("song3rock");
        return arrayList;
    }
}
