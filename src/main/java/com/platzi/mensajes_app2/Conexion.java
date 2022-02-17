package com.platzi.mensajes_app2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    Connection conector = null;

    public Connection establecerConexion(){
    	
        try {
        	          
        	conector = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mensajes_app?serverTimezone=UTC","root","");
            JOptionPane.showMessageDialog(null, "Se conecto correctamente");

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexion: "+e.toString());

        }
        return conector;

    }
}
