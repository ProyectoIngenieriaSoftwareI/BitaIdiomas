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
import co.edu.unbosque.Bitacora.View.VentanaActualizarUsuarios;


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
	ResultSet resultadoConsulta;
	Statement ejecutarConsulta = null;
	Statement ejecutarSql = null;
   
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



    public void Actualizar(DatosVO datos){
		
	 	Connection reg = (Connection) DBPalabraDAO();
		try{
			String query="UPDATE usuario SET nombre = ? , apellido = ? , nombreusuario = ? , contraseña = ? WHERE idUsuario = ?";
		      PreparedStatement preparedStmt = reg.prepareStatement(query);
		      preparedStmt.setString(1, datos.getNombre());
		      System.out.println("entra"+datos.getNombre());
		      preparedStmt.setString(2, datos.getApellido());
		      preparedStmt.setString(3, datos.getUsuario());
		      preparedStmt.setString(4, datos.getPassword());
		      preparedStmt.setString(5, datos.getUser_id());
		      System.out.println(datos.getApellido());		 
		      preparedStmt.executeUpdate();		
			
			/*System.out.println(query);
			InsertarStmt = reg.prepareStatement(query);
    	 	InsertarStmt.setString(1, datos.getNombre());
    	 	InsertarStmt.setString(2, datos.getApellido());
    	 	InsertarStmt.setString(3, datos.getUsuario());
    	 	InsertarStmt.setString(4, datos.getPassword());
    	 	InsertarStmt.setString(5, id);
    	 	InsertarStmt.executeUpdate(query);
    	 	System.out.println(InsertarStmt);*/

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmación",JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException	 e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
	}
    public void EliminarUsuario(String nick) {
	 	Connection reg = (Connection) DBPalabraDAO();
    		try {
    			String query = "delete from usuario where nombreusuario = " + "'"+nick+"'";
    			Statement delete = (Statement) reg.prepareStatement(query);
    			delete.executeUpdate(query);
    			JOptionPane.showMessageDialog(null,
    					" Se ha Eliminado Correctamente", "Información",
    					JOptionPane.INFORMATION_MESSAGE);
    			
    			reg.close();
    		} catch (Exception e) {
    			System.err.println(e.getMessage());
    			JOptionPane.showMessageDialog(null, "No se Eliminó");
    		}

    	   }

 
    	public ArrayList getUsers() throws SQLException {
    		ArrayList<ArrayList> Tabla = new ArrayList();
    	 	Connection reg = (Connection) DBPalabraDAO();
    		String Sentencia = "SELECT * FROM usuario";
    		Statement load = (Statement) reg.createStatement();
    		resultadoConsulta = load.executeQuery(Sentencia);
    		while (resultadoConsulta.next()) {
    			ArrayList<String> MiBase = new ArrayList();
    			MiBase.add(resultadoConsulta.getString("idUsuario"));
    			MiBase.add(resultadoConsulta.getString("nombre"));
    			MiBase.add(resultadoConsulta.getString("apellido"));
    			MiBase.add(resultadoConsulta.getString("nombreusuario"));
    			MiBase.add(resultadoConsulta.getString("contraseña"));
    			MiBase.add(resultadoConsulta.getString("tipoUsuario"));
    			Tabla.add(MiBase);
    		}
    		return Tabla;
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