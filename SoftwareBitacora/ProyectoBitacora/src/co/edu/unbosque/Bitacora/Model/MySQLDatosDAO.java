package co.edu.unbosque.Bitacora.Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import co.edu.unbosque.Bitacora.View.RegistroUsuario;


public class MySQLDatosDAO implements DatosDAO {
	
	public String bd = "mydb";
	public String login = "root";
	public String password = "sergio";
	public String url = "jdbc:mysql://localhost/"+bd;
	Connection con = null;
    private PreparedStatement InsertarStmt;
    private PreparedStatement getStmt;
    private PreparedStatement updateStmt;
   
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

    public void InsertarPalabra(DatosVO pal) {
    	System.out.println("Usuario ID: "+ModelLogin.id);
		System.out.println("Idioma origen: " + pal.getIdioma_origen());
		System.out.println("idioma destino: " + pal.getIdioma_destino());
		System.out.println("Palabra: "+pal.getPalabra());
		System.out.println("Traduccion: "+pal.getTraduccion());
		
		
		java.util.Calendar cal = Calendar.getInstance();
		java.util.Date utilDate = new java.util.Date(); // your util date
		cal.setTime(utilDate);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);    
		java.sql.Date sqlDate1 = new java.sql.Date(cal.getTime().getTime()); // your sql date
		System.out.println("utilDate:" + utilDate);
		System.out.println("sqlDate1:" + sqlDate1);
		
		Connection reg = (Connection) DBPalabraDAO();
		String sql;
		sql = "INSERT INTO palabra (Usuario_idUsuario,palabra, idiomaOrigen, fecha,traduccion,idiomaDestino)VALUES(?,?,?,?,?,?)";

		if (pal.getPalabra() != null && pal.getTraduccion()!=null) {
			try {
				java.util.Date date = new java.util.Date();
				java.sql.Date sqlDate = new java.sql.Date(date.getTime()); 
				
				InsertarStmt = reg.prepareStatement(sql);
				InsertarStmt.setString(1, ModelLogin.id);
				InsertarStmt.setString(2, pal.getPalabra());
				InsertarStmt.setString(3, pal.getIdioma_origen());
				InsertarStmt.setDate(4, sqlDate);
				InsertarStmt.setString(5, pal.getTraduccion());
				InsertarStmt.setString(6, pal.getIdioma_destino());
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
			JOptionPane.showMessageDialog(null, "Porfavor ingrese tanto la palabra como la traduccion");
		
    }
   
    /**
     * @param idiomaorigen 
     * @return
     */
    public DatosVO getPalabras(String idiomaorigen) {
        // TODO implement here
        return null;
    }

    /**
     * @param idioma_origen
     */
    public void Actualizar(String idioma_origen) {
        // TODO implement here
    }

    /**
     * @param user_id
     */
    public void getUsers(int user_id) {
        // TODO implement here
    }

    /**
     * @param usuario 
     * @param password
     */
    public void InsertarUsuario(String nombre, String contraseña, String apellido,
			String nombreUsuario, String tipousuario) {
        // TODO implement here
		Connection reg = (Connection) DBPalabraDAO();
		String sql;
		sql = "INSERT INTO usuario (nombre, apellido, nombreusuario, tipoUsuario, contraseña)VALUES(?,?,?,?,?)";
		boolean qw = validadrnick(nombreUsuario);
		System.out.println(qw);

		if (qw == true) {
			try {
				InsertarStmt = reg.prepareStatement(sql);
				InsertarStmt.setString(1, nombre);
				InsertarStmt.setString(2, apellido);
				InsertarStmt.setString(3, nombreUsuario);
				InsertarStmt.setString(4, tipousuario);
				InsertarStmt.setString(5, contraseña);
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

}