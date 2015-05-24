package co.edu.unbosque.Bitacora.Controller;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

import co.edu.unbosque.Bitacora.Model.MySQLDatosDAO;
import co.edu.unbosque.Bitacora.View.EstudianteView;
import co.edu.unbosque.Bitacora.View.ProfesorView;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class validarNICK {
public Boolean validadrnick(String user){
	
	boolean valid=true;
	  String cap="";
		MySQLDatosDAO conectar = new MySQLDatosDAO();
      Connection reg = (Connection) conectar.DBPalabraDAO();
      String sql;
      sql = "SELECT nombreusuario FROM usuario";
      try {	
          Statement st = (Statement) reg.createStatement();
          ResultSet rs = st.executeQuery(sql); 
          while (rs.next()) {
                 cap=rs.getString("nombreusuario");
                
                 if(user.equals(cap)){
                	valid=false;
                	System.out.println("entro, el repetido es :"+cap);
                 }
              }
      } catch (Exception e1) {
          e1.printStackTrace();
      }
      return valid;
}
}
