package sqlmanager;

import org.apache.commons.dbcp2.BasicDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class SQLConnection
{
    protected static Connection con;
    protected static BasicDataSource basicDataSource;

    protected void getDataSource(String url, String user, String password) throws IOException, SQLException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
        properties.load(fis);
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(properties.getProperty(url));
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(password);
        //inicial size of connections
        basicDataSource.setInitialSize(5);
        con = basicDataSource.getConnection();
    }

    protected void getConnection(String url, String user, String password) throws SQLException, IOException {
            Properties properties = new Properties();
            FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
            properties.load(fis);
            con = DriverManager.getConnection(properties.getProperty(url));
    }

    public Connection getConnection() throws SQLException {
        return con;
    }

    public ResultSet statementExecuteQuery(String query) throws SQLException {
        ResultSet resultSet = null;
        if (con != null) {
            Statement statement = con.createStatement();
             resultSet = statement.executeQuery(query);
        }
        return resultSet;
    }

    public void closeConnection() throws SQLException {
        if (con != null){
            con.close();
        }
    }
}
