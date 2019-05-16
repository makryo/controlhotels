/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iUser
 */
public class Conexion {
  private static Connection con;
    private static String stringConexion;
    private static boolean conected = false;
   
    public static void main(String args[])
    {
      try
        {
        Class.forName("org.postgresql.Driver");
        stringConexion = "jdbc:postgresql://localhost:5432/controlhotels";
        con = DriverManager.getConnection(stringConexion,"postgres","Halcon19");
        conected = true;
        
        }
        catch(ClassNotFoundException | SQLException ex)
        {
        System.out.println("Error en la conexion: " +ex.getMessage());
        
        }
    }
}

    
   
    
   

