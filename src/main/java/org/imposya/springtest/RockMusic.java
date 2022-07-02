package org.imposya.springtest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class RockMusic implements Music{
    @PostConstruct
    public void init() {
        System.out.println("init rock");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy rock");
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
