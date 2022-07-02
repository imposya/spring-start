package org.imposya.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public List<Music> musicBean() {
        List<Music> arraylist = new ArrayList<>();
        arraylist.add(classicalMusic());
        arraylist.add(jazzMusic());
        arraylist.add(rockMusic());
        return arraylist;
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicBean());
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
