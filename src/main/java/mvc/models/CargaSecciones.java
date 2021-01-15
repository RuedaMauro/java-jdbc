package mvc.models;

import sqlmanager.PostgreSQLConnection;
import sqlmanager.SQLConnection;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CargaSecciones {

    private SQLConnection sqlConnection;

    public CargaSecciones() {
        try {
            sqlConnection = new PostgreSQLConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void ejecutaConsultas() {
        Cliente cliente = new Cliente();
        try {
            rs = sqlConnection.statementExecuteQuery("Select * from clientes.clientes.cliente");

        }catch (Exception e){
            e.printStackTrace();
        }
        // set and get
    }

    public ResultSet rs;

}
