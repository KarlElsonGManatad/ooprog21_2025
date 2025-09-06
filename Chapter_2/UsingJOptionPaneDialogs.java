package Chapter_2;
import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String name;
        while ((name = JOptionPane.showInputDialog("Enter Your Name")) != null)
            if (JOptionPane.showConfirmDialog(null, "Show your name?") == JOptionPane.YES_OPTION)
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}
//✅Allows the user to enter their name.
//✅confirmation dialog asking whether they want their name to be shown.
//✅If the user confirms, display their name in a message dialog.
//✅If the user cancels or chooses not to confirm, return the user back to the Input name dialog.

//learn for this activity is JoptionPane.showInputDialog,
                                      //.showConfirmDialog,
                                      //.showMessageDialog
//