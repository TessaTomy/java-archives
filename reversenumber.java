import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class reversenumber extends JFrame implements ActionListener
{
  JLabel l1;
  JTextField t1;
   JButton b;
  JLabel l3;
  JTextField t3;

public reversenumber()
{
     setLayout(new FlowLayout());
     l1=new JLabel("Enter Number:");
     t1=new JTextField(20); 
     b=new JButton("Reverse");
     l3=new JLabel("Result");
     t3=new JTextField(20);
     add(l1);
     add(t1);
     add(b);
     add(l3);
     add(t3);
     b.addActionListener(this);
     setVisible(true);
     setSize(360,200);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

 public void actionPerformed(ActionEvent e)
  {
int reversed=0;
Object source = e.getSource();
if(source == b)
{   
 int num1=Integer.parseInt(t1.getText());
    while(num1 != 0) {
    
       int digit = num1 % 10;
      reversed = reversed * 10 + digit;
      num1 /= 10;
    }

        t3.setText(Integer.toString(reversed));
  }

}
public static void main(String args[])
{ 
reversenumber ob1=new reversenumber();
}
}
