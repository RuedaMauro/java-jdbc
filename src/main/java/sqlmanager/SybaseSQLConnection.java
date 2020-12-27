package sqlmanager;

import java.io.IOException;
import java.sql.SQLException;

public class SybaseSQLConnection extends SQLConnection
{
    public SybaseSQLConnection() throws IOException, SQLException {
        getConnection("urlpostres","","");
    }
}
