import javax.swing.*;
import java.awt.*;

public class panel {
    public static void main(String[] args){
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        redPanel.setBackground(Color.blue);
        redPanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        redPanel.setBackground(Color.green);
        redPanel.setBounds(0, 250, 250, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
