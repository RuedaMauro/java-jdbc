import sqlmanager.PostgreSQLConnection;
import sqlmanager.SQLConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTransactions {

    /*
     * seTAutoCommit() se puede tratar como bloque default:true
     * commit() confirma el bloque "OK al bloque"
     * rollBack() garantiza el rollback
     * */

    public static void main(String[] args) {

        SQLConnection sqlConnection = null;

        Connection connection = null;

        try {
            sqlConnection = new PostgreSQLConnection();

            connection= sqlConnection.getConnection();


            connection.setAutoCommit(false);

            //sql queries

            Statement statement = connection.createStatement();

            statement.executeUpdate("query");

            sqlConnection.getConnection().commit();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                sqlConnection.closeConnection();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
