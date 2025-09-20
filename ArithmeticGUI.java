import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticGUI extends JFrame implements ActionListener {
    JLabel l1;
    JTextField t1;
    JLabel l2;
    JTextField t2;
    JButton add1;
    JLabel l3;
    JTextField t3;
    JButton sub;
    JButton mul;
    JButton div;

    public ArithmeticGUI() {
        setLayout(new FlowLayout());

        l1 = new JLabel("First Number:");
        t1 = new JTextField(20);

        l2 = new JLabel("Second Number:");
        t2 = new JTextField(20);

        add1 = new JButton("Add");
        sub = new JButton("Sub");
        mul = new JButton("Mul");
        div = new JButton("Div");

        l3 = new JLabel("Result");
        t3 = new JTextField(20);
        t3.setEditable(false);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(add1);
        add(sub);
        add(mul);
        add(div);
        add(l3);
        add(t3);

        add1.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
        setSize(360, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int value = 0;

            if (source == add1) {
                value = num1 + num2;
            } else if (source == sub) {
                value = num1 - num2;
            } else if (source == mul) {
                value = num1 * num2;
            } else if (source == div) {
                value = num1 / num2;
            }

            t3.setText(Integer.toString(value));
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        } catch (ArithmeticException ex) {
            t3.setText("Divide by zero");
        }
    }

    public static void main(String args[]) {
        new ArithmeticGUI();
    }
}
