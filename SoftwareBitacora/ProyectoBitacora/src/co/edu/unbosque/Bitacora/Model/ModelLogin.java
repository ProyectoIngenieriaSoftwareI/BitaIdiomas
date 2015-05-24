package co.edu.unbosque.Bitacora.Model;

import java.sql.ResultSet;
import java.util.*;

import javax.swing.JOptionPane;

import co.edu.unbosque.Bitacora.Controller.Conexion;
import co.edu.unbosque.Bitacora.View.AdminView;
import co.edu.unbosque.Bitacora.View.EstudianteView;
import co.edu.unbosque.Bitacora.View.ProfesorView;
import co.edu.unbosque.Bitacora.View.registroadmon;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * 
 */
public class ModelLogin extends BitacoraModel {
	/**
     * 
     */
	public ModelLogin() {
	}

	/**
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean ValidarLogin(String user, String password) {
		// TODO implement here
		if ((user.isEmpty()) || (password.isEmpty())) {
        JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y contraseña");
    } else {
        String cap="";
        String cap1="";
        Conexion conectar = new Conexion();
        Connection reg = (Connection) conectar.conectar();
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
                	   cap1=rs.getString("idUsuario");
                	   System.out.println(cap1);
                	   EstudianteView e1 = new EstudianteView();
                       e1.setVisible(true);  
                   }else if(tipodeusuario==1){
                	   ProfesorView p1 = new ProfesorView();
                	   p1.setVisible(true);
                   }else if(tipodeusuario==0){
                	   AdminView a1 = new AdminView();
                	   a1.setVisible(true);
                   }
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
		return false;
	}
}