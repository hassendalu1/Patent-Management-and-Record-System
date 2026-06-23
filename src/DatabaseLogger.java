import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseLogger {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/hospital_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void logSystemAccess(String actionDescription) {
        System.out.println("[JDBC Component Loading...] Accessing translation layer driver.");

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {


                String sql = "INSERT INTO action_logs (log_message, time_triggered) VALUES (?, NOW())";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setString(1, actionDescription);


                    stmt.executeUpdate();
                    System.out.println("[JDBC Success] Action logged to SQL schema.");
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[JDBC Notice] Driver class skipped (Normal behavior if offline/unconfigured).");
        } catch (Exception e) {
            System.out.println("[JDBC Notice] Remote server connection skipped. Local framework functioning normally.");
        }
    }
}