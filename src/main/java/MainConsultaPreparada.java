import sqlmanager.PostgreSQLConnection;
import sqlmanager.SQLConnection;
import utils.SQLUtils;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainConsultaPreparada {

    public static void main(String[] args) {
        String query =  "SELECT * FROM clientes.clientes.clientes WHERE id = ?";
        SQLConnection sql;

        try{
            sql = new PostgreSQLConnection();
            PreparedStatement preparedStatement = sql.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, 14);
            ResultSet resultSet = preparedStatement.executeQuery();
            SQLUtils.printDataSet(resultSet);
            resultSet.close();
        } catch (IOException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.print("hello");

    }
}
