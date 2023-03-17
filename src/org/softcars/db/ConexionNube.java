package org.softcars.db;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 * @author Israel
 */
public class ConexionNube{
  Connection conn;
  public Connection open(){
      try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection(
  "jdbc:mysql://us-east.connect.psdb.cloud/softcars?sslMode=VERIFY_IDENTITY",
  "kdywetarsu4ije43u6gf",
  "pscale_pw_iQTAy5lz0EiAIovz3lOLEL71hg9nLreWo6tLmrrIs2J");
          return conn;
      }catch(Exception ex){
          throw new RuntimeException(ex);
      }
  }
  
  public void close(){
      if(conn != null){
          try{
              conn.close();
          }catch(Exception e){
              e.printStackTrace();
              System.out.println("Sesion Cerrada Exitosamente :)");
          }
      }
  }
}