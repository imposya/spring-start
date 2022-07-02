package org.imposya.springtest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Component

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    @PostConstruct
    public void init() {
        System.out.println("init classical");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy classical");
    }
    @Override
    public List<String> getSong() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("song1classic");
        arrayList.add("song2classic");
        arrayList.add("song3classic");
        return arrayList;
    }
}
