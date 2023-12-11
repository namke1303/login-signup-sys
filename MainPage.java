import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainPage extends JFrame implements ActionListener{
    private static JFrame frame = new JFrame();
    private static JButton buttonLogin = new JButton();
    private static JButton buttonSignup = new JButton();
    private static JLabel label = new JLabel();
    MainPage(){

        frame.setSize(400,150);
        frame.setTitle("mainPage");
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

        label.setText("Da li se zelite prijaviti ili napraviti novi racun?");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(100,100,250,250);

        buttonLogin = new JButton("Login");
        buttonLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonLogin.setBounds(60,30,80,30);
        buttonLogin.setFocusable(false);
        buttonLogin.addActionListener(this);
        

        buttonSignup = new JButton("Signup");
        buttonSignup.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonSignup.setBounds(240,30,80,30);
        buttonSignup.addActionListener(this);
        frame.add(buttonSignup);
        frame.add(buttonLogin);
        frame.add(label);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        if(e.getSource()==buttonLogin){
            System.out.println("Korisnis se zeli prijaviti.");
            frame.dispose();
            LoginForm loginForm = new LoginForm();
        }
        if(e.getSource()==buttonSignup){
            System.out.println("Korisnik zeli kreirati novi racun.");
            frame.dispose();
            SignupForm signupForm = new SignupForm();
        }
    }
}
