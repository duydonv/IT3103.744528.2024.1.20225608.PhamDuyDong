import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "Pham Duy Dong - 5608 - You 've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,
                        "Pham Duy Dong - 5608 - Please input the first number: ","Pham Duy Dong - 5608 - Input the first number",
                        JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
                        "Pham Duy Dong - 5608 - Please input the second number: ","Pham Duy Dong - 5608 - Input the second number",
                        JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification,
                    "Pham Duy Dong - 5608 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
