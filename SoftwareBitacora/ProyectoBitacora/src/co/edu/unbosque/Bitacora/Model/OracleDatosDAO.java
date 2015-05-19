package co.edu.unbosque.Bitacora.Model;

import java.sql.PreparedStatement;
import java.util.*;

import co.edu.unbosque.Bitacora.Model.DatosDAO;

/**
 * 
 */
public class OracleDatosDAO implements DatosDAO {

	/**
     * 
     */
	public OracleDatosDAO() {
	}

	/**
     * 
     */
	private PreparedStatement InsertarStmt;

	/**
     * 
     */
	private PreparedStatement getStmt;

	/**
     * 
     */
	private PreparedStatement updateStmt;

	/**
	 * @param url
	 * @param usuario
	 * @param Password
	 */
	public void DBPalabraDAO(String url, String usuario, String Password) {
		// TODO implement here
	}

	/**
	 * @param pal
	 */
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
	public void InsertarUsuario(String usuario, String password) {
		// TODO implement here
	}

}