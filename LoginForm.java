import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class LoginForm extends JFrame implements ActionListener{
    private static JFrame frame = new JFrame();
    private static JLabel label = new JLabel();
    private static JLabel labelUsername = new JLabel();
    private static JLabel labelPassword = new JLabel();
    private static JLabel labelLogin = new JLabel();
    private static JTextField textField = new JTextField(20);
    private static JPasswordField passwordField = new JPasswordField(20);
    private static JButton login = new JButton("Login");
    LoginForm(){
        frame.setSize(400,230);
        frame.setTitle("Login");
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        label.setText("Odabrali ste prijavu.");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(100,100,250,250);

        labelUsername.setText("Username");
        labelUsername.setBounds(105,10,70,40);
        labelUsername.setAlignmentX(Component.CENTER_ALIGNMENT);

        labelPassword.setText("Password");
        labelPassword.setBounds(105,60,70,40);

        textField.setBounds(105,40,165,20);
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);

        passwordField.setBounds(105,90,165,20);
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);

        login = new JButton("Login");
        login.setAlignmentX(Component.CENTER_ALIGNMENT);
        login.setBounds(150,120,80,30);
        login.setFocusable(false);
        login.addActionListener(this);

        labelLogin.setText("Uspjesno si se prijavio");
        labelLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelLogin.setBounds(150,100,250,250);
        

        
        frame.add(login);
        frame.add(labelUsername);
        frame.add(labelPassword);
        frame.add(passwordField);
        frame.add(textField);
        frame.add(label);
       
        

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = textField.getText();
        String password = passwordField.getText();
        if(e.getSource()==login){
            if(user.equals("namik") && password.equals("123")){
                frame.add(labelLogin);
                System.out.println("Namik dobro dosao u Admin Panel.");
                //frame.dispose();
                //AdminPanel adminPanel = new AdminPanel();

                
                
            }
            else System.out.println("Neko se zeli prijaviti");
        }
    }
}
