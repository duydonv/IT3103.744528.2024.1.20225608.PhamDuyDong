import java.util.Scanner;
public class bai65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pham Duy Dong - 5608 - Chon cach nhap mang:");
        System.out.println("Pham Duy Dong - 5608 - 1. Nhap mang tu ban phim");
        System.out.println("Pham Duy Dong - 5608 - 2. Su dung mang hang so");
        System.out.print("Pham Duy Dong - 5608 - Nhap lua chon (1 hoac 2): ");
        int choice = scanner.nextInt();

        double[] numbers; 

        if (choice == 1) {
            System.out.print("Pham Duy Dong - 5608 - Nhap so luong phan tu trong mang: ");
            int n = scanner.nextInt();
            numbers = new double[n];
            System.out.println("Pham Duy Dong - 5608 - Nhap cac phan tu cua mang: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextDouble();
            }
        } else {
            numbers = new double[]{50, 20, 30, 40, 10}; 
            System.out.println("Pham Duy Dong - 5608 - Su dung mang hang so: 50, 20, 30, 40, 10");
        }

        bubbleSort(numbers);

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;

        System.out.print("Pham Duy Dong - 5608 - Mang sau khi sap xep: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Pham Duy Dong - 5608 - Tong cac phan tu: " + sum);
        System.out.println("Pham Duy Dong - 5608 - Gia tri trung binh: " + average);
        scanner.close();
    }

    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
