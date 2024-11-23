package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;

public class Bai61 {
    public static void main(String[] args) {
        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Choose an option", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            System.out.println("You chose 'Yes'!");
        } else if (response == JOptionPane.NO_OPTION) {
            System.out.println("You chose 'No'.");
        } else {
            System.out.println("You closed the dialog without choosing!");
        }

        String[] options = {"I agree", "I don't agree"};
        int selectedOption = JOptionPane.showOptionDialog(null, 
                "Do you want to upgrade to first class?", 
                "Choose an option", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, 
                options[0]);

        displayUserChoice(selectedOption, options);
    }

    private static void displayUserChoice(int selectedOption, String[] options) {
        if (selectedOption == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "You closed the dialog without choosing!");
        } else {
            JOptionPane.showMessageDialog(null, "You chose: " + options[selectedOption]);
        }
    }
}
