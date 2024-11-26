package AimsProject;

public class CartTest {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart cart = new Cart();

        // Tạo DVD và thêm DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "The Lion King", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Science Fiction", "Star Wars", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // In thông tin giỏ hàng
        cart.print();   

        // Tìm kiếm DVD theo ID
        int searchId = 2; // ID cần tìm
        DigitalVideoDisc foundById = cart.searchById(searchId);
        if (foundById != null) {
            System.out.println("Pham Duy Dong - 5608 - Found by ID: " + foundById.toString());
        } else {
            System.out.println("Pham Duy Dong - 5608 - No DVD found with ID: " + searchId);
        }

        // Tìm kiếm DVD theo tiêu đề
        String searchTitle = "Star Wars"; 
        DigitalVideoDisc foundByTitle = cart.searchByTitle(searchTitle);
        if (foundByTitle != null) {
            System.out.println("Pham Duy Dong - 5608 - Found by Title: " + foundByTitle.toString());
        } else {
            System.out.println("Pham Duy Dong - 5608 - No DVD found with title: " + searchTitle);
        }
    }  
}