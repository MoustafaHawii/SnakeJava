import javax.swing.*;
import java.awt.*;

/**
 * @author Moustafa Sven Hawi
 * @date 15.02
 * @version 1.0
 * Dieser Code ist von einem YouTube Video, der Ersteller des Videos ist Bro Code.
 */
public class GameFrame extends JFrame {
    //Konstruktor
    public GameFrame(){
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new GamePanel(), BorderLayout.CENTER);
        this.setTitle("SnakeJava");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
}
