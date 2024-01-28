// Write your code here

package com.example.song;

import java.util.ArrayList;

public interface SongRepository {

    public ArrayList<Song> getSongs();

    public Song addSong(Song song);

    public Song getSong(int songId);

    public Song updateSong(int songId, Song song);

    public void deleteSong(int songId);

}