package database;

import java.sql.*;

public class ExcetuteQureyThrowDatabase {
    public static ResultSet connectExecuteQuery(String query) throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
        Connection connectObject = null;
        try {
            Class.forName("org.postgresql.Driver");
                  connectObject= DriverManager.getConnection("jdbc:postgresql://postgresql-101090-0.cloudclusters.net:10142/amazon","shabarish","19e101@130E");

            Statement statementObject=connectObject.createStatement();
            //System.out.println(query);
            ResultSet resultSetObject=statementObject.executeQuery(query);
            connectObject.close();
            return resultSetObject;
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return null;
    }
}
