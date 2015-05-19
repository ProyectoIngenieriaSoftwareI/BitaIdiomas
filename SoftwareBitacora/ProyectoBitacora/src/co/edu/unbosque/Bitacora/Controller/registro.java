package co.edu.unbosque.Bitacora.Controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import co.edu.unbosque.Bitacora.View.RegistroUsuario;
/**
 *
 * @author Carlos
 */
public class registro {
    public void registrarUsuario(String nombre, String codigo){
    Conexion conn = new Conexion();
    Connection reg = (Connection) conn.conectar();
    String sql;
    sql="INSERT INTO estudiante (nombre,codigo)VALUES(?,?)";
    try{
        PreparedStatement pst=reg.prepareStatement(sql);
        pst.setString(1, nombre);
        pst.setString(2, codigo);
        int n= pst.executeUpdate();
        if(n>0){
            JOptionPane.showMessageDialog(null, "registro");
        }
    }catch(SQLException ex){
        Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE,null,ex);
    }
    
    
    
    }
}