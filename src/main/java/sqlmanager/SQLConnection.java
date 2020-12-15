package sqlmanager;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class SQLConnection
{
    protected static Connection con;
    private static String dbUrl;

    public void getConnection() throws SQLException, IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("./config.properties");
        properties.load(fis);
        con = DriverManager.getConnection(properties.getProperty(dbUrl));
    }

    public void setUrl(String url){
        this.dbUrl = url;
    }

    public ResultSet statementExecuteQuery(String query) throws SQLException {
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }
}
