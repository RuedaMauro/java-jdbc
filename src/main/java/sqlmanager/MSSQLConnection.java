package sqlmanager;

public class MSSQLConnection extends SQLConnection {

    public MSSQLConnection() throws ClassNotFoundException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //to use mssqljdbc library
        setUrl("urlmssql");
    }
}
