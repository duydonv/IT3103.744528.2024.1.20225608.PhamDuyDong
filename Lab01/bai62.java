import java.util.Scanner;
public class bai62{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Pham Duy Dong - 5608 - What's your name?");
        String strName = keyboard.nextLine();
        System.out.println("Pham Duy Dong - 5608 - How old are you?");
        int iAge = keyboard.nextInt();
        System.err.println("Pham Duy Dong - 5608 - How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        System.out.println("Pham Duy Dong - 5608 - Mrs/Mr. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + " m." );

        keyboard.close();
    }
}