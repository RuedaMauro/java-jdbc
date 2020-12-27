package sqlmanager;

import java.io.IOException;
import java.sql.SQLException;

public class MSSQLConnection extends SQLConnection {

    public MSSQLConnection() throws ClassNotFoundException, IOException, SQLException {
        // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //to use mssqljdbc library
        // getConnection("urlmssql","","");
    }
}
