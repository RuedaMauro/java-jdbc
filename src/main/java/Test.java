import sqlmanager.PostgreSQLConnection;
import sqlmanager.SQLConnection;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        SQLConnection sql = new PostgreSQLConnection();
        ResultSet result = sql.statementExecuteQuery("SELECT * FROM clientes.clientes.clientes");

        while(result.next())
        {
            System.out.println(result.getString(3));
        }
    }
}
