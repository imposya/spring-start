package org.imposya.springtest;

import org.springframework.stereotype.Component;
@Component
public class JazzMusic implements Music{
    public void init() {
        System.out.println("init jazz");
    }
    public void destroy() {
        System.out.println("destroy jazz");
    }
    @Override
    public String getSong() {
        return "Feeling good";
    }
}
