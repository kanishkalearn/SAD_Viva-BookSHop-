package Database;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {

    private static String ip;
    private static String port;
    private static String dbName;
    private static String username;
    private static String password;

    private static Connection c;

    static {

        
        try {
            setUpConnection();
        } catch (Exception ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getIp() {
        return ip;
    }

    public static String getPort() {
        return port;
    }

    public static String getDbName() {
        return dbName;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setIp(String ip) {
        DB.ip = ip;
    }

    public static void setPort(String port) {
        DB.port = port;
    }

    public static void setDbName(String dbName) {
        DB.dbName = dbName;
    }

    public static void setUsername(String username) {
        DB.username = username;
    }

    public static void setPassword(String password) {
        DB.password = password;
    }

    private static void setUpConnection() throws Exception {
        
        ip = "localhost";
        port = "3308";
        dbName = "book_shop";
        username = "root";
        password = "456";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + dbName + "?useUnicode=true&characterEncoding=UTF-8", "" + username + "", "" + password + "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Data Base Connection Failed,, Try restartng your Machine and Mysql services", "Failed to connect", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void iud(String sql) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c.createStatement().executeQuery(sql);

    }

    public static Connection getConnection() throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c;
    }

    

    public static void main(String[] args) {
        System.out.println(ip);
        System.out.println(port);
        System.out.println(DB.dbName);
        System.out.println(DB.username);
        System.out.println(DB.password);

    }
}
