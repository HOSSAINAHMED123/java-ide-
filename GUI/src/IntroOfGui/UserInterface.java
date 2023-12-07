package IntroOfGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(1000, 500);
        JLabel label1,label2,label3;

        label1=new JLabel("email");
        label1.setBounds(100,100,50,50);
        JTextField email = new JTextField();
       email.setBounds(150, 100, 200, 40); // Adjusted bounds for email field
        label2=new JLabel("password");
        label2.setBounds(100,150,50,50);
        JTextField password = new JTextField();
        password.setBounds(150, 150, 200, 40);

        label3=new JLabel("Searching....");
        label3.setBounds(150,200,100,100);

        JButton button = new JButton("Submit");
        button.setBounds(150, 200, 200, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(email.getText().equals("hossain@gmail")&&password.getText().equals("12345"))
                {
                  label3.setText("Welcome");
                }
                else{
                  label3.setText("wrong password or email");
                }

            }
        });
        frame.add(email);
        frame.add(password);
        frame.add(button);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);


        frame.setLayout(null);
        frame.setVisible(true);
    }
}

