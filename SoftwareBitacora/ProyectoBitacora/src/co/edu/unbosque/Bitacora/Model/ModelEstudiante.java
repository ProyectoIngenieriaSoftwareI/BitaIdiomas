package co.edu.unbosque.Bitacora.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import co.edu.unbosque.Bitacora.Controller.CoordinadorController;
import co.edu.unbosque.Bitacora.Model.BitacoraModel;
import co.edu.unbosque.Bitacora.View.RegistroUsuario;

public class ModelEstudiante extends BitacoraModel {

	private CoordinadorController coordinador;
	private MySQLDatosDAO m1 = new MySQLDatosDAO();
	ResultSet resultadoConsulta;
	Statement ejecutarConsulta = null;
	Statement ejecutarSql = null;
	private Connection reg;

	public ModelEstudiante() {
	}

	public void GenerarQuiz() {
		// TODO implement here
	}

	public void InsertarPalabras(DatosVO pal) {
		System.out.println("Usuario ID: " + ModelLogin.id);
		System.out.println("Idioma origen: " + pal.getIdioma_origen());
		System.out.println("idioma destino: " + pal.getIdioma_destino());
		System.out.println("Palabra: " + pal.getPalabra());
		System.out.println("Traduccion: " + pal.getTraduccion());

		reg = (Connection) m1.DBPalabraDAO();
		String sql;
		sql = "INSERT INTO palabra (Usuario_idUsuario,palabra, idiomaOrigen, fecha,traduccion,idiomaDestino)VALUES(?,?,?,?,?,?)";

		if (pal.getPalabra() != null && pal.getTraduccion() != null) {
			try {
				java.util.Date date = new java.util.Date();
				java.sql.Date sqlDate = new java.sql.Date(date.getTime());
				m1.InsertarStmt = reg.prepareStatement(sql);
				m1.InsertarStmt.setString(1, ModelLogin.id);
				m1.InsertarStmt.setString(2, pal.getPalabra());
				m1.InsertarStmt.setString(3, pal.getIdioma_origen());
				m1.InsertarStmt.setDate(4, sqlDate);
				m1.InsertarStmt.setString(5, pal.getTraduccion());
				m1.InsertarStmt.setString(6, pal.getIdioma_destino());
				int n = m1.InsertarStmt.executeUpdate();
				if (n > 0) {
					JOptionPane.showMessageDialog(null, "Registro Exitoso");
				}
				m1.InsertarStmt.close();
				m1.cerrarConexion();
			} catch (SQLException ex) {
				Logger.getLogger(RegistroUsuario.class.getName()).log(
						Level.SEVERE, null, ex);
			}
		} else
			JOptionPane.showMessageDialog(null,
					"Porfavor ingrese tanto la palabra como la traduccion");
	}

	public ArrayList getPalabras(String user_id) throws SQLException {
		ArrayList<ArrayList> Tabla = new ArrayList();
		reg = (Connection) m1.DBPalabraDAO();
		String Sentencia = "SELECT idiomaOrigen, palabra, idiomaDestino,traduccion,idpalabra FROM palabra WHERE Usuario_idUsuario="
				+ user_id;
		Statement load = (Statement) reg.createStatement();
		resultadoConsulta = load.executeQuery(Sentencia);
		while (resultadoConsulta.next()) {
			ArrayList<String> MiBase = new ArrayList();
			MiBase.add(resultadoConsulta.getString("idpalabra"));
			MiBase.add(resultadoConsulta.getString("palabra"));
			MiBase.add(resultadoConsulta.getString("traduccion"));
			Tabla.add(MiBase);
		}
		return Tabla;
	}

	public void eliminarPalabra(String id) {
		try {
			String query = "delete from palabra where idpalabra = " + id;
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

	public boolean ValidarInsercionPalabra(String idiomaO, String IdiomaD,
			int index) {

		if (idiomaO.isEmpty() || IdiomaD.isEmpty() || index == 0) {
			return false;
		}
		return true;
	}

	public void setCoordinador(CoordinadorController coordinador) {
		this.coordinador = coordinador;
	}

}