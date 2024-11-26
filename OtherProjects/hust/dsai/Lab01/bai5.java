import javax.swing.JOptionPane;
public class bai5 {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "Pham Duy Dong - 5608 - The results are: ";

        strNum1 = JOptionPane.showInputDialog(null, 
        "Pham Duy Dong - 5608 - Please input the first number: ","Pham Duy Dong - 5608 - Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, 
        "Pham Duy Dong - 5608 - Please input the second number: ","Pham Duy Dong - 5608 - Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        strNotification += "Sum = " + sum;
        double difference = num1 - num2;
        strNotification += " Difference = " + difference;
        double production = num1 * num2;
        strNotification += " Production = " + production;
        double quotient = num1 / num2;
        strNotification += " Quotient = " + quotient;

        JOptionPane.showMessageDialog(null, strNotification, "Pham Duy Dong - 5608 - The results ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
