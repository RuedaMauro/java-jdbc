import sqlmanager.MSSQLConnection;
import sqlmanager.PostgreSQLConnection;
import sqlmanager.SQLConnection;
import utils.SQLUtils;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MainBase {

    public static void main(String[] args) {
        SQLConnection sql = null;
        try {
            sql = new PostgreSQLConnection();
            ResultSet result = sql.statementExecuteQuery("SELECT * FROM clientes.clientes.clientes");
            SQLUtils.printDataSet(result);
        } catch (IOException | SQLException | ClassNotFoundException | NullPointerException e) {
            e.printStackTrace();
        } finally {
            if (sql != null) {
                try {
                    sql.closeConnection();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        System.out.println("hello!");
    }
}
