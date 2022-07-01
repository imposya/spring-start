package org.imposya.springtest;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    public void init() {
        System.out.println("init rock");
    }
    public void destroy() {
        System.out.println("destroy rock");
    }
    @Override
    public String getSong() {
        return "Monster";
    }
}
