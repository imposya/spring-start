package org.imposya.springtest;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("song1jazz");
        arrayList.add("song2jazz");
        arrayList.add("song3jazz");
        return arrayList;
    }
}
