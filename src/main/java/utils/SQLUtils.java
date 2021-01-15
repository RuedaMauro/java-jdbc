package utils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class SQLUtils {

    public static void printResultSet(ResultSet result) throws SQLException {
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
