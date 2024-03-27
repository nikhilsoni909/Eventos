package eventos.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class dbutil {
    private static Connection conn;

    public dbutil() {
    }

    public static Connection provideConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                String connectionString="jdbc:oracle:thin:@localhost:1521:xe";
                String username = "eventos"; // Oracle username
                String password = "root"; // Oracle password
                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver"); // Oracle JDBC driver
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                conn = DriverManager.getConnection(connectionString, username, password);
                System.out.println("Connection Successful");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(PreparedStatement ps) {
        try {
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
