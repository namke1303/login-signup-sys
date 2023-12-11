import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignupForm extends JFrame implements ActionListener{
    private static JFrame frame = new JFrame();
    private static JLabel label = new JLabel();
    private static JLabel labelUsername = new JLabel();
    private static JLabel labelPassword = new JLabel();
    private static JLabel labelsignup = new JLabel();
    private static JLabel labelPasswordVerify = new JLabel();
    private static JTextField textField = new JTextField(20);
    private static JPasswordField passwordField = new JPasswordField(20);
    private static JPasswordField passwordFieldVerify = new JPasswordField(20);
    private static JButton signup = new JButton("Signup");
    SignupForm(){
        frame.setSize(400,300);
        frame.setTitle("Signup");
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        label.setText("Odabrali ste kreiranje novog racuna..");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(100,100,250,250);

        labelUsername.setText("Username");
        labelUsername.setBounds(105,10,70,40);
        labelUsername.setAlignmentX(Component.CENTER_ALIGNMENT);

        labelPassword.setText("Password");
        labelPassword.setBounds(105,60,70,40);

        labelPasswordVerify.setText("Re-enter password");
        labelPasswordVerify.setBounds(105,110,150,40);

        textField.setBounds(105,40,165,20);
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);

        passwordField.setBounds(105,90,165,20);
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);

        passwordFieldVerify.setBounds(105,140,165,20);

        signup = new JButton("Signup");
        signup.setAlignmentX(Component.CENTER_ALIGNMENT);
        signup.setBounds(150,180,80,30);
        signup.setFocusable(false);
        signup.addActionListener(this);



        frame.add(signup);
        frame.add(passwordField);
        frame.add(passwordFieldVerify);
        frame.add(textField);
        frame.add(labelUsername);
        frame.add(labelPassword);
        frame.add(labelPasswordVerify);
        frame.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = textField.getText();
        String password = passwordField.getText();
        String passwordVerify = passwordFieldVerify.getText();
        //labelsignup.setText("Uspjesno si kreirao racun.");
        //labelsignup.setBounds(105,200,200,100);
        if(password.equals(passwordVerify)){
            System.out.println("Korisnik "+username+" je upravo napravio racun!");
            //frame.add(labelsignup);
        }
        else System.out.println("Pogrijesili ste sifru.");

    }
}
