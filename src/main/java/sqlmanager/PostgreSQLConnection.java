package sqlmanager;

import java.io.IOException;
import java.sql.SQLException;

public class PostgreSQLConnection extends SQLConnection {

    public PostgreSQLConnection() throws IOException, ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        //getConnection("urlpostres","postgres", "admin");
        getDataSource("urlpostres","postgres", "admin");
    }
}
