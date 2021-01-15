import sqlmanager.PostgreSQLConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class MainMetaDatos {

    public static void main(String[] args) {

        //relativos info de la bd gestor conector

        //relativos a un conjunto de resultados nombre de tablas nombres de campos tipo de datos de los campos

        //relativos a parametros de sentencias preparadas

        PostgreSQLConnection postgreSQLConnection;

        try {
            postgreSQLConnection = new PostgreSQLConnection();
            Connection con = postgreSQLConnection.getConnection();
            DatabaseMetaData databaseMetaData = con.getMetaData();
            System.out.print( databaseMetaData.getDatabaseProductName() +  "\n" +
                    databaseMetaData.getDatabaseProductVersion() + "\n" +
                    databaseMetaData.getDriverName() + "\n" +
                    databaseMetaData.getDriverVersion() );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
