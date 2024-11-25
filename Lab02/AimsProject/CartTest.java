package AimsProject;

public class CartTest {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart cart = new Cart();

        // Tạo DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "The Lion King", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Science Fiction", "Star Wars", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Animation", "Aladin", 18.99f);

        // Kiểm tra phương thức thêm 1 DVD
        System.out.println("\n=== Pham Duy Dong - 5608 - Adding a single DVD ===");
        cart.addDigitalVideoDisc(dvd1);

        // Kiểm tra phương thức thêm danh sách DVD
        System.out.println("\n=== Pham Duy Dong - 5608 Adding multiple DVDs (array) ===");
        DigitalVideoDisc[] dvdList = {dvd2, dvd3};
        cart.addDigitalVideoDisc(dvdList);

        // Kiểm tra phương thức thêm 2 DVD
        System.out.println("\n=== Pham Duy Dong - 5608 - Adding two DVDs ===");
        cart.addDigitalVideoDisc(dvd1, dvd3);
    }   
}
