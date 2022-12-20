package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductStoredDatbase {
    public static void productStoreDetails(String a) throws SQLException {

        // DriverManager.registerDriver(org.postgresql.Driver);
        Connection connectObject=null;
        connectObject= DriverManager.getConnection("jdbc:postgresql://localhost:5432/amazon","postgres","19e101");
        Statement statementObject=connectObject.createStatement();
        statementObject.execute(a);

        connectObject.close();
    }
}
