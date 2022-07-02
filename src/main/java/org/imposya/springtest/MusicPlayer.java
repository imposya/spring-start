package org.imposya.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic")Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(Genres genre) {
        Random random = new Random();
        int a = random.nextInt(3);
        if (genre == Genres.CLASSICAL) {
            return "Playing: " + music2.getSong().get(a);
        }
        else
            return "Playing: " + music1.getSong().get(a);
    }
}
