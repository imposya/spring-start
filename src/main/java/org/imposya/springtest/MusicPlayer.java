package org.imposya.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private JazzMusic jazzMusic;
@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
    }

    public String playMusic() {
    return "Playing: " + classicalMusic.getSong();
    }
}
