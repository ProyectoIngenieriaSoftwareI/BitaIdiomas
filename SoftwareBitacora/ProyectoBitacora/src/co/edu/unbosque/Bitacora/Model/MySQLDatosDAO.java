package co.edu.unbosque.Bitacora.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import co.edu.unbosque.Bitacora.Controller.CoordinadorController;
import co.edu.unbosque.Bitacora.View.RegistroUsuario;


public class MySQLDatosDAO  {
	
	public String bd = "mydb";
	public String login = "root";
	public String password = "Neosergio_182";
	public String url = "jdbc:mysql://localhost/"+bd;
	Connection con = null;
    public PreparedStatement InsertarStmt;
    private PreparedStatement getStmt;
    private PreparedStatement updateStmt;
	private CoordinadorController coordinador;
   
    public MySQLDatosDAO() {
    }

    public Connection DBPalabraDAO() {
    	try {
    		Class.forName("org.gjt.mm.mysql.Driver");
    		con = DriverManager.getConnection(url, login, password);
    		    System.out.println("conexion establecida");
    		}
    		catch(SQLException ex) {
    		System.out.println("Rayos!!! Hubo un problema al conectar con la base "+url);
    		}
    		catch(ClassNotFoundException ex) {
    		System.out.println(ex);
    		}
    		   return con;
    		}
    
    public void cerrarConexion() {
        try {
            this.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLDatosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



 
    public void Actualizar(DatosVO datos) {
        // TODO implement here
    }
    
    public void EliminarUsuario(String id_usuario) {
        // TODO implement here
    }

 
    public DatosVO getUsers() {
		return null;
        // TODO implement here
    }

  
    public void InsertarUsuario(DatosVO v1) {
    	  // TODO implement here
    	 	Connection reg = (Connection) DBPalabraDAO();
    	 	String sql;
    	 	sql = "INSERT INTO usuario (nombre, apellido, nombreusuario, tipoUsuario, contraseña)VALUES(?,?,?,?,?)";
    	 	boolean qw = validadrnick(v1.getUsuario());
    	 	System.out.println(qw);

    	 	if (qw == true) {
    	 	try {
    	 	InsertarStmt = reg.prepareStatement(sql);
    	 	InsertarStmt.setString(1, v1.getNombre());
    	 	InsertarStmt.setString(2, v1.getApellido());
    	 	InsertarStmt.setString(3, v1.getUsuario());
    	 	InsertarStmt.setString(4, v1.getTipoUsuario());
    	 	InsertarStmt.setString(5, v1.getPassword());
    	 	int n = InsertarStmt.executeUpdate();
    	 	if (n > 0) {
    	 	JOptionPane.showMessageDialog(null, "Registro Exitoso");
    	 	}
    	 	InsertarStmt.close();
    	 	cerrarConexion();
    	 	} catch (SQLException ex) {
    	 	Logger.getLogger(RegistroUsuario.class.getName()).log(
    	 	Level.SEVERE, null, ex);
    	 	}
    	 	} else
    	 	JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
    	  }
    public Boolean validadrnick(String user){
    	
    	boolean valid=true;
    	  String cap="";
          Connection reg = (Connection)DBPalabraDAO();
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
              st.close();
              cerrarConexion();
          } catch (Exception e1) {
              e1.printStackTrace();
          }
          return valid;
    }
    
    public void setCoordinador(CoordinadorController coordinador) {
		this.coordinador=coordinador;
	}

}