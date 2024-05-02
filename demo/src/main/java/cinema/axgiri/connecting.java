package cinema.axgiri;

import java.sql.*;
import javax.swing.JOptionPane;

public class connecting {
    Connection conn;
    
    public static Connection ConnectorDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tickets", "root", "root");
                    return conn;
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
