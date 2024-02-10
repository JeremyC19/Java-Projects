import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("wallpaper.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.cyan);

    }
}
