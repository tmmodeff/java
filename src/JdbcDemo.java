import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "password"
            );
            System.out.println("connection sucessfully:");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}