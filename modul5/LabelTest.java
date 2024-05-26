package modul5;

import java.awt.*;
import javax.swing.*;

public class LabelTest extends JFrame{
    private JLabel label;

    public LabelTest()
    {
        super("Mencoba Label");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label = new JLabel("Label dengan text");
        label.setToolTipText("ini adalah label1");
        container.add(label);
        setSize(500,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        LabelTest aplikasi = new LabelTest();
        aplikasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

