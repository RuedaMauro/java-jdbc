package mvc.views;

import mvc.controllers.Controller;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    public View(){
        setTitle("MVC test");
        setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        jComboBox = new JComboBox();
        jComboBox.setEditable(false);

        JButton jButton = new JButton("Agregar");
        jPanel.add(jComboBox);
        add(jPanel, BorderLayout.NORTH);
        add(jButton, BorderLayout.SOUTH);
        addWindowListener(new Controller(this));
    }

    public JComboBox jComboBox;
}
