package co.edu.unbosque.Bitacora.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import co.edu.unbosque.Bitacora.Controller.validarNICK;
import co.edu.unbosque.Bitacora.View.RegistroUsuario;


public class MySQLDatosDAO implements DatosDAO {
	
	public String bd = "mydb";
	public String login = "root";
	public String password = "Neosergio_182";
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
        // TODO implement here
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
    	MySQLDatosDAO conn = new MySQLDatosDAO();
		Connection reg = (Connection) conn.DBPalabraDAO();
		String sql;
		sql = "INSERT INTO usuario (nombre, apellido, nombreusuario, tipoUsuario, contraseña)VALUES(?,?,?,?,?)";
		validarNICK v1 = new validarNICK();
		boolean qw = v1.validadrnick(nombreUsuario);
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
					JOptionPane.showMessageDialog(null, "registro");
				}
			} catch (SQLException ex) {
				Logger.getLogger(RegistroUsuario.class.getName()).log(
						Level.SEVERE, null, ex);
			}
		} else
			JOptionPane.showMessageDialog(null, "ya está");
    }

}