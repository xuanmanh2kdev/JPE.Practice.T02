package fa.training.problem03.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=InventorySystem;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String password = "12345678";
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connect success!");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
