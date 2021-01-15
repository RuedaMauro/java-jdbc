import sqlmanager.PostgreSQLConnection;
import sqlmanager.SQLConnection;
import utils.SQLUtils;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// CallableStatement

public class MainStoredProcedure {

    public static void main(String[] args)  {

        SQLConnection sql;

        try {
            sql = new PostgreSQLConnection();
            // TODO: 10/1/2021 destiny for result set postgres 
            CallableStatement callableStatement = sql.getConnection().prepareCall("CALL crear_cliente()");
            ResultSet resultSet = callableStatement.executeQuery();

            SQLUtils.printResultSet(resultSet);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
