package sqlmanager;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        SQLConnection sql = new SybaseSQLConnection();

        sql.getConnection();
        ResultSet result = sql.statementExecuteQuery("select top 50 * from authors");

        while(result.next())
        {
            System.out.println(result.getString(3));
        }
    }
}
