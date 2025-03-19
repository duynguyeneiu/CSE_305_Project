
package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class LibraryManager {
    private ArrayList<MusicTrack> songs;
    private Map<String, MusicTrack> songMap;

    public LibraryManager() {
        songs = new ArrayList<>();
        songMap = new HashMap<>();
    }

    public void setSongs(ArrayList<MusicTrack> songs) {
        this.songs = songs;
        updateSongMap();
    }

    public ArrayList<MusicTrack> getSongs() {
        return songs;
    }

    private void updateSongMap() {
        songMap.clear();
        for (MusicTrack track : songs) {
            songMap.put(track.getTitle().toLowerCase(), track);
        }
    }

   

    private Optional<MusicTrack> findSong(String title) {
        return Optional.ofNullable(songMap.get(title.toLowerCase()));
    }

    public void removeTrack(String title) {
        Optional<MusicTrack> trackToRemove = findSong(title);
        if (trackToRemove.isPresent()) {
            songs.remove(trackToRemove.get());
            songMap.remove(title.toLowerCase());
        } else {
            JOptionPane.showMessageDialog(null, "Track not found.");
        }
    }
    public void addSong(MusicTrack newTrack) {
        if (newTrack == null || newTrack.getTitle() == null || newTrack.getTitle().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid track data.");
            return;
        }

        Optional<MusicTrack> existingTrack = findSong(newTrack.getTitle());

        if (existingTrack.isPresent()) {
            JOptionPane.showMessageDialog(null, "Track already exists.");
        } else {
            songs.add(newTrack);
            songMap.put(newTrack.getTitle().toLowerCase(), newTrack);
            JOptionPane.showMessageDialog(null, "Track added successfully.");
        }
    }
}