// Java connection with MySQL Code Here....

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class javaConncet {
    Connection conn=null;
    
    public static Connection ConnectorDB(){
      try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_ms_database","root","amit");
          return conn;
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e); 
      }
      return  null;
}
}
