
  [initial-upload] Swing-based arithmetic calculator with modular layout
  [class] ArithmeticPanel extends JFrame; handles button-driven operations
  [gui] Three-panel structure using FlowLayout and GridLayout
  [logic] Performs +, –, , %,  operations on two inputs; displays result
  [run-instructions] Compile with `javac ArithmeticPanel.java`, run with `java ArithmeticPanel`
 

import java.awt.;
import java.awt.event.;
import javax.swing.;

public class ArithmeticPanel extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4, b5, b6;

    public ArithmeticPanel() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.setLayout(new GridLayout(3, 2, 10, 10));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));

        l1 = new JLabel(Number );
        l2 = new JLabel(Result );
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        b1 = new JButton(+);
        b2 = new JButton(-);
        b3 = new JButton();
        b4 = new JButton(%);
        b5 = new JButton();
        b6 = new JButton(Clear);

        p1.add(l1);
        p1.add(t1);
        p1.add(t3);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);

        p3.add(l2);
        p3.add(t2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        setLayout(new GridLayout(3, 1));
        add(p1);
        add(p2);
        add(p3);

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int x = Integer.parseInt(t1.getText().trim());
            int y = Integer.parseInt(t3.getText().trim());

            if (e.getSource() == b1) {
                t2.setText(String.valueOf(x + y));
            } else if (e.getSource() == b2) {
                t2.setText(String.valueOf(x - y));
            } else if (e.getSource() == b3) {
                t2.setText(String.valueOf(x  y));
            } else if (e.getSource() == b4) {
                t2.setText(String.valueOf(x % y));
            } else if (e.getSource() == b5) {
                t2.setText(String.valueOf(x  y));
            } else if (e.getSource() == b6) {
                t1.setText();
                t2.setText();
                t3.setText();
            }
        } catch (Exception ex) {
            t2.setText(Error);
        }
    }

    public static void main(String[] args) {
        new ArithmeticPanel();
    }
}
