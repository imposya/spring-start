package org.imposya.springtest;

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
