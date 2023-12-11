import javax.swing.*;

public class AdminPanel {
    private static JFrame frame = new JFrame();
    private static JButton buttonLogin = new JButton();
    private static JButton buttonSignup = new JButton();
    private static JLabel label = new JLabel();

    AdminPanel(){
        frame.setSize(400,300);
        frame.setTitle("Admin Panel");
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
