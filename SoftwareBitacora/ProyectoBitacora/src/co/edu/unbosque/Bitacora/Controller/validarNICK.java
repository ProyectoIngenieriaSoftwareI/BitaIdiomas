package co.edu.unbosque.Bitacora.Controller;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import co.edu.unbosque.Bitacora.View.EstudianteView;
import co.edu.unbosque.Bitacora.View.ProfesorView;
import co.edu.unbosque.Bitacora.View.registroadmon;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class validarNICK {
public Boolean validadrnick(String user){
	boolean valid=false;
	  String cap="";
      Conexion conectar = new Conexion();
      Connection reg = (Connection) conectar.conectar();
      String sql;
      sql = "SELECT nombreusuario FROM usuario";
      try {	
          Statement st = (Statement) reg.createStatement();
          ResultSet rs = st.executeQuery(sql); 
          while (rs.next()) {
                 cap=rs.getString("nombreusuario");
                 System.out.println(cap);
                 if(user==cap){
                	valid=false;
                	System.out.println("entro");
                 }
              }
      } catch (Exception e1) {
          e1.printStackTrace();
      }
      return valid;
}
}
