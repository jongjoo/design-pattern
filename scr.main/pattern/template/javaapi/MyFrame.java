package pattern.template.javaapi;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "Hello World!!";
        graphics.drawString(msg, 100, 100);
    }

    public MyFrame() {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
