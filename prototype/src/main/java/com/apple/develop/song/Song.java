package com.apple.develop.song;

import lombok.ToString;

@ToString
public class Song {
    String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}
