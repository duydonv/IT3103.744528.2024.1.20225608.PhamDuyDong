import javax.swing.JOptionPane;    

public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Pham Duy Dong - 5608 - Please enter your name:");
        JOptionPane.showMessageDialog(null, "Toi la Pham Duy Dong 5608. Hi " + result + "!");
        System.exit(0);
    }
}   
