package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();        // Pham Duy Dong - 5608

    // Constructor(s)
    public CompactDisc(int id, String title, String category, String artist, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
        this.artist = artist;			//Pham Duy Dong - 5608
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Method to add a track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Pham Duy Dong - 5608 - Track \"" + track.getTitle() + "\" is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Pham Duy Dong - 5608 - Track \"" + track.getTitle() + "\" has been added to the CD.");
        }
    }

    // Method to remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Pham Duy Dong - 5608 - Track \"" + track.getTitle() + "\" has been removed from the CD.");
        } else {
            System.out.println("Pham Duy Dong - 5608 - Track \"" + track.getTitle() + "\" is not in the CD.");
        }
    }

    // Method to calculate total length of the CD
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Implement play() from Playable interface
    public void play() {
    System.out.println("Pham Duy Dong - 5608 - Playing Compact Disc: " + getTitle());
    System.out.println("Pham Duy Dong - 5608 - Artist: " + artist);
    for (Track track : tracks) {
        track.play(); // Call play() of each track
    }
    System.out.println("Pham Duy Dong - 5608 - Total CD length: " + getLength() + " mins");
    }
}
