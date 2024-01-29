import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // 1 - create frame
        JFrame frame = new JFrame("My first frame");
        frame.setSize(500,500);

        // 2 - create panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(140, 74, 20));

        // 3 - create components
        JLabel label = new JLabel("Herro world");
        JButton button = new JButton("Push Me");
        JTextField textField = new JTextField(10);
        
        // add image
        // image must be in the same folder as the project or you
        // need to spedify the class path
        ImageIcon icon = new ImageIcon("images/PNG/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);


        // 4 - add components to panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);

        // 5 - add panel to frame
        frame.add(panel);

        // 6 - set frame visible
        frame.setVisible(true);

    }
}