package sqlmanager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class PostgreSQLConnection extends SQLConnection {

    public PostgreSQLConnection() throws IOException, SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        getConnection("urlpostres","postgres", "admin");
    }
}
