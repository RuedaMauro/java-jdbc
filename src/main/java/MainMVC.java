import mvc.views.View;

import javax.swing.*;

public class MainMVC {

    public static void main(String[] args) {
        View view = new View();
        view.setVisible(true);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
