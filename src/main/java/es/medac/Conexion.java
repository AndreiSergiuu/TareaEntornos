package es.medac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

       private Connection conexion;
       private String url = "jdbc:mysql://localhost:3308/medac";
       private String user = "Admin";
       private String pwd = "12345";

       private boolean estaInstanciado = false;

       public Conexion(){




       }

       public Connection getConexion() {

              try {
                     conexion = (Connection) DriverManager.getConnection(url, user, pwd);
                     System.out.println("Se ha abierto la conexion correctamente");
              } catch (SQLException error) {
                     System.out.println("Ha surgido el siguiente error: " + error.toString());
              }

              return conexion;

       }

       public void cerrarConexion() {
              try {
                     this.conexion.close();
                     System.out.println("Se ha cerrado la conexion");
              } catch (SQLException error) {
                     System.out.println("Ha sucedido el siguiente error: " + error.toString());
              }
       }

}
