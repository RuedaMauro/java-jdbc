import sqlmanager.PostgreSQLConnection;
import sqlmanager.SQLConnection;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {
        SQLConnection sql = null;
        try {
            sql = new PostgreSQLConnection();
            ResultSet result = sql.statementExecuteQuery("SELECT * FROM clientes.clientes.clientes");
            printDataSet(result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
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

    static void printDataSet(ResultSet result) throws SQLException {
        ResultSetMetaData metaData = result.getMetaData();
        int columnsNumber = metaData.getColumnCount();

        for (int i = 1; i <= columnsNumber; i++){
            System.out.print(metaData.getColumnName(i) + " | ");
        }
        System.out.print("\n");
        while(result.next())
        {
            for (int i = 1; i <= columnsNumber; i++ ){
                System.out.print(result.getString(i) + " | ");
            }
            System.out.print("\n");
        }
    }
}
