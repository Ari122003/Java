package AppLet;

import java.awt.event.*;
import javax.swing.*;

public class AdapterExample extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getPoint());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Adapter Example");
        frame.setSize(300, 300);
        frame.addMouseListener(new AdapterExample());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
