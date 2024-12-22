package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable {
    // Fields to store track information
    private String title;                   //Pham Duy Dong - 5608
    private int length;

    // Constructor: Initialize the fields
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter for title
    public String getTitle() {  			// Pham Duy Dong - 5608
        return title;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Pham Duy Dong - 5608 - Playing Track: " + title);
            System.out.println("Pham Duy Dong - 5608 - Track length: " + length + " mins");
        } else {
            throw new PlayerException("Pham Duy Dong - 5608 - ERROR: Track length is non-positive!");
        }
    }

    public boolean equals(Object obj) {			// Pham Duy Dong - 5608
        if (this == obj) return true; // Check reference equality
        if (obj == null || getClass() != obj.getClass()) return false; // Check null and class type

        Track track = (Track) obj; // Cast object to Track
        return length == track.getLength() && title != null && title.equalsIgnoreCase(track.getTitle()); // Compare title and length
    }
}
