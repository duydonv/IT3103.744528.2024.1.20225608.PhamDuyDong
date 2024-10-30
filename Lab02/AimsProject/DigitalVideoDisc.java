package AimsProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;        //Pham Duy Dong - 5608
    private int length;
    private float cost;
    
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;                //Pham Duy Dong - 5608
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }

    // Constructor 1: Create DVD by title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // Constructor 2: Create DVD by category, title, and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;																		//Pham Duy Dong - 5608
        this.cost = cost;
    }

    // Constructor 3: Create DVD by director, category, title, and cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;																		//Pham Duy Dong - 5608
        this.cost = cost;
    }

    // Constructor 4: Create DVD by all attributes: title, category, director, length, cost
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
}
