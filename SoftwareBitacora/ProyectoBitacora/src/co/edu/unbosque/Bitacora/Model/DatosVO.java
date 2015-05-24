package co.edu.unbosque.Bitacora.Model;

import java.util.*;

public class DatosVO {

	public DatosVO() {
	}
	private String palabra;
	private Integer pal_id;
	private String idioma_origen;
	private String idioma_destino;
	private String user_id;
	private String usuario;
	private String password;
	private String traduccion;
	
	public String getIdioma_destino() {
		return idioma_destino;
	}

	public void setIdioma_destino(String idioma_destino) {
		this.idioma_destino = idioma_destino;
	}

	public String getTraduccion() {
		return traduccion;
	}

	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public Integer getPal_id() {
		return pal_id;
	}

	public void setPal_id(Integer pal_id) {
		this.pal_id = pal_id;
	}

	public String getIdioma_origen() {
		return idioma_origen;
	}

	public void setIdioma_origen(String idioma_origen) {
		this.idioma_origen = idioma_origen;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}