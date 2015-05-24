package co.edu.unbosque.Bitacora.Model;

import java.sql.ResultSet;
import java.util.*;
import javax.swing.JOptionPane;
import co.edu.unbosque.Bitacora.View.AdminView;
import co.edu.unbosque.Bitacora.View.EstudianteView;
import co.edu.unbosque.Bitacora.View.ProfesorView;
import co.edu.unbosque.Bitacora.View.VentanaAñadirBitacora;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ModelLogin extends BitacoraModel {
	
	public static String id;
	public static int tipo=3;
	public ModelLogin() {
	}

	public boolean ValidarLogin(String user, String password) {
		// TODO implement here
		if ((user.isEmpty()) || (password.isEmpty())) {
        JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y contraseña");
    } else {
        String cap="";
        MySQLDatosDAO conectar = new MySQLDatosDAO();
        Connection reg = (Connection) conectar.DBPalabraDAO();
        String sql;
			sql = "SELECT * FROM usuario WHERE nombreusuario='" + user + "' AND contraseña ='" + password + "'";
        try {	
            Statement st = (Statement) reg.createStatement();
            ResultSet rs = st.executeQuery(sql); 
            while (rs.next()) {
                   cap=rs.getString("tipoUsuario");
                   int tipodeusuario= Integer.parseInt(cap);
                   System.out.println(tipodeusuario);
                   if(tipodeusuario==2){
                	   id=rs.getString("idUsuario");
                	   tipo=2;                	   
                   }else if(tipodeusuario==1){
                	   tipo=1;                	   
                   }else if(tipodeusuario==0){
                	   tipo=0;                	   
                   }
            }
            st.close();
            conectar.cerrarConexion();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
		return false;
	}
	
}