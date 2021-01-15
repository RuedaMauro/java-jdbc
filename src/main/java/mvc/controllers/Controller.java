package mvc.controllers;

import mvc.models.CargaSecciones;
import mvc.models.Cliente;
import mvc.views.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//interface windowListener -> method windowOpened
//class window adapter
public class Controller extends WindowAdapter {

    public Controller(View view){
        this.view = view;
    }

    public void windowOpened(WindowEvent event){
        cargaSecciones.ejecutaConsultas();
        try {
            while (cargaSecciones.rs.next())
                view.jComboBox.addItem(cargaSecciones.rs.getString(2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    CargaSecciones cargaSecciones = new CargaSecciones();

    private View view;

}
