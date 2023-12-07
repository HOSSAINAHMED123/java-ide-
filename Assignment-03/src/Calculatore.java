import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatore extends JFrame {
    private JTextField input1;
    private JTextField input2;
    private JTextField output;

    public Calculatore() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        input1 = new JTextField();
        input2 = new JTextField();
        output = new JTextField();
        output.setBounds(new Rectangle(200,50));
        output.setEditable(false);

        panel.add(new JLabel("Number 1: "));
        panel.add(input1);
        panel.add(new JLabel("Number 2: "));
        panel.add(input2);

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        panel.add(new JLabel("Result: "));
        panel.add(output);
        add(panel);
        setVisible(true);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {    int x= Integer.parseInt(input1.getText());
                    int y= Integer.parseInt(input2.getText());
                    String result= String.valueOf(x+y) ;
                    input1.setText(null);
                    input2.setText(null);
                    output.setText(result);

                }
                catch (Exception a)
                {
//                    output.setText("Error!!try again");
                    //JOptionPane.showMessageDialog(panel,"Try again");
                }


            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {    int x= Integer.parseInt(input1.getText());
                    int y= Integer.parseInt(input2.getText());
                    String result= String.valueOf(x-y) ;
                    input1.setText(null);
                    input2.setText(null);
                    output.setText(result);

                }
                catch (Exception a)
                {
                    output.setText("Error!!try again");
                }


            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {    int x= Integer.parseInt(input1.getText());
                    int y= Integer.parseInt(input2.getText());
                    String result= String.valueOf(x*y) ;
                    input1.setText(null);
                    input2.setText(null);
                    output.setText(result);

                }
                catch (Exception a)
                {
                    output.setText("Error!!try again");
                }


            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float x= Integer.parseInt(input1.getText());
                    float y= Integer.parseInt(input2.getText());
                    try{
                        if (y == 0) {
                            output.setText("Can't divide by zero");
                        } else {
                            float result = x / y;
                            String out = String.valueOf(result);
                            input1.setText(null);
                            input2.setText(null);
                            output.setText(out);
                        }


                }


                catch (Exception a)
                {
                    output.setText("Error!!try again");
                }


            }
        });
    }

    public static void main(String[] args) {
        new Calculatore();
    }
}
