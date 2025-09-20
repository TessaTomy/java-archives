import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerDemo extends JFrame implements KeyListener {
    JLabel instructions;
    JTextField textField;
    JTextArea keyEvents;

    KeyListenerDemo() {
        setTitle("KeyListener Example");

        // Instruction Label
        instructions = new JLabel("Type something in the text field:");
        instructions.setBounds(20, 20, 200, 20);

        // Text Field
        textField = new JTextField(20);
        textField.setBounds(20, 50, 200, 20);
        textField.addKeyListener(this);

        // Key Events Text Area
        keyEvents = new JTextArea();
        keyEvents.setBounds(20, 110, 300, 200);
        keyEvents.setEditable(false);

        add(instructions);
        add(textField);
        add(keyEvents);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyTyped(KeyEvent e) {
        keyEvents.append("Key Typed: " + e.getKeyChar() + "\n");
    }

    public void keyPressed(KeyEvent e) {
        keyEvents.append("Key Pressed: " + e.getKeyChar() + "\n");
    }

    public void keyReleased(KeyEvent e) {
        keyEvents.append("Key Released: " + e.getKeyChar() + "\n");
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }
}
