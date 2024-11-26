package AimsProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;        //Pham Duy Dong - 5608
    private int length;
    private float cost;
    // Thuộc tính lớp (static): Theo dõi số lượng DVD đã được tạo
    private static int nbDigitalVideoDiscs = 0;
    // Thuộc tính đối tượng: ID duy nhất của mỗi DVD
    private int id;

    // Constructor 1: Tạo DVD chỉ với title
    public DigitalVideoDisc(String title) {
        this.title = title;
        // Tăng số lượng DVD đã được tạo
        nbDigitalVideoDiscs++;
        // Gán ID cho DVD
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor 2: Tạo DVD với category, title, cost
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor 3: Tạo DVD với director, category, title, cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;                         //Pham Duy Dong - 5608
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor 4: Tạo DVD với tất cả thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Getter cho ID
    public int getId() {
        return id;
    }

    // Getter cho số lượng DVD đã tạo
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

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
<<<<<<< Updated upstream

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
=======
    public void setTitle(String title) {
		this.title = title;
	}
>>>>>>> Stashed changes
}
