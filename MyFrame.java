import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    private JButton button;

    public MyFrame() {
        super("Paint App");
        setSize(1366, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        ImageIcon image = new ImageIcon("paint.png");
        setIconImage(image.getImage());
        getContentPane().setBackground(Color.white);
	}

}
