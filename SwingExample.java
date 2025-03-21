import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Java Swing Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Click the button!", SwingConstants.CENTER);
        label.setBounds(100, 50, 200, 30);
        frame.add(label);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(150, 100, 100, 30);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        frame.setLayout(null); // Use absolute positioning
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}

