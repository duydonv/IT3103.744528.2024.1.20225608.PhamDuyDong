package hust.soict.dsai.aims.media;

public class Disc extends Media {
    // Fields specific to Disc
    private int length;
    private String director;						

    // Constructor 1: Disc with all Media fields + length, director
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost); 
        this.length = length;
        this.director = director;
    }

    // Constructor 2: Disc with minimal attributes          // Pham Duy Dong - 5608
    public Disc(int id, String title) {
        super(id, title); 
    }

    // Getters
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}
