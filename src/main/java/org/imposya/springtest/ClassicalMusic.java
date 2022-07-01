package org.imposya.springtest;

import org.springframework.stereotype.Component;
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
    public String getSong() {
        return "Rhapsody";
    }
}
