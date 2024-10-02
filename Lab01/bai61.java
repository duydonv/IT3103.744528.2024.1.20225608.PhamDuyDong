import javax.swing.JOptionPane;

public class bai61 {
    public static void main(String[] args){
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(null, 
            "Pham Duy Dong - 5608 - Do you want to change to the first class ticket?",
            "Pham Duy Dong - 5608 - You have chosen: ",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

        JOptionPane.showMessageDialog(null, "Pham Duy Dong - 5608 - You have chosen: " + (option==JOptionPane.YES_OPTION?"Yes" : "No"));
        System.exit(0);

        
      
    }
}
