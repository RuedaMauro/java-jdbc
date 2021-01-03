package mvc.views;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    public View(){
        setTitle("MVC test");
        setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Agregar");
        add(jButton, BorderLayout.SOUTH);

    }
}
