package co.edu.unbosque.Bitacora.Controller;

import co.edu.unbosque.Bitacora.Model.DatosVO;
import co.edu.unbosque.Bitacora.Model.ModelEstudiante;
import co.edu.unbosque.Bitacora.Model.ModelLogin;
import co.edu.unbosque.Bitacora.Model.ModelProfesor;
import co.edu.unbosque.Bitacora.Model.MySQLDatosDAO;
import co.edu.unbosque.Bitacora.View.AdminView;
import co.edu.unbosque.Bitacora.View.EstudianteView;
import co.edu.unbosque.Bitacora.View.Login;
import co.edu.unbosque.Bitacora.View.ProfesorView;
import co.edu.unbosque.Bitacora.View.RegistroUsuario;
import co.edu.unbosque.Bitacora.View.VentanaActualizarUsuarios;
import co.edu.unbosque.Bitacora.View.VentanaAñadirBitacora;
import co.edu.unbosque.Bitacora.View.VentanaConsultaCursos;
import co.edu.unbosque.Bitacora.View.VentanaConsultaPalabra;
import co.edu.unbosque.Bitacora.View.VentanaQuiz;
import co.edu.unbosque.Bitacora.View.VentanaRegistroAdmon;

public class CoordinadorController {
	private ModelEstudiante modeloestu;
	private ModelLogin modelologin;
	private ModelProfesor modeloprofesor;
	private MySQLDatosDAO modelobd;
	private AdminView vistaadmon;
	private EstudianteView vistaestudiante;
	private Login vistalogin;
	private ProfesorView vistaprofesor;
	private RegistroUsuario registrousuario;
	private VentanaActualizarUsuarios actualizarusu;
	private VentanaAñadirBitacora registrarpalabra;
	private VentanaConsultaCursos listarcursos;
	private VentanaConsultaPalabra listarpalabras;
	private VentanaQuiz quiz;
	private VentanaRegistroAdmon registroadmin;
	
	public void setModeloestu(ModelEstudiante modeloestu) {
		this.modeloestu = modeloestu;
	}

	public ModelLogin getModelologin() {
		return modelologin;
	}

	public void setModelologin(ModelLogin modelologin) {
		this.modelologin = modelologin;
	}

	public ModelProfesor getModeloprofesor() {
		return modeloprofesor;
	}

	public void setModeloprofesor(ModelProfesor modeloprofesor) {
		this.modeloprofesor = modeloprofesor;
	}

	public MySQLDatosDAO getModelobd() {
		return modelobd;
	}

	public void setModelobd(MySQLDatosDAO modelobd) {
		this.modelobd = modelobd;
	}

	public AdminView getVistaadmon() {
		return vistaadmon;
	}

	public void setVistaadmon(AdminView vistaadmon) {
		this.vistaadmon = vistaadmon;
	}

	public EstudianteView getVistaestudiante() {
		return vistaestudiante;
	}

	public void setVistaestudiante(EstudianteView vistaestudiante) {
		this.vistaestudiante = vistaestudiante;
	}

	public Login getVistalogin() {
		return vistalogin;
	}

	public void setVistalogin(Login vistalogin) {
		this.vistalogin = vistalogin;
	}

	public ProfesorView getVistaprofesor() {
		return vistaprofesor;
	}

	public void setVistaprofesor(ProfesorView vistaprofesor) {
		this.vistaprofesor = vistaprofesor;
	}

	public RegistroUsuario getRegistrousuario() {
		return registrousuario;
	}

	public void setRegistrousuario(RegistroUsuario registrousuario) {
		this.registrousuario = registrousuario;
	}

	public VentanaActualizarUsuarios getActualizarusu() {
		return actualizarusu;
	}

	public void setActualizarusu(VentanaActualizarUsuarios actualizarusu) {
		this.actualizarusu = actualizarusu;
	}

	public VentanaAñadirBitacora getRegistrarpalabra() {
		return registrarpalabra;
	}

	public void setRegistrarpalabra(VentanaAñadirBitacora registrarpalabra) {
		this.registrarpalabra = registrarpalabra;
	}

	public VentanaConsultaCursos getListarcursos() {
		return listarcursos;
	}

	public void setListarcursos(VentanaConsultaCursos listarcursos) {
		this.listarcursos = listarcursos;
	}

	public VentanaConsultaPalabra getListarpalabras() {
		return listarpalabras;
	}

	public void setListarpalabras(VentanaConsultaPalabra listarpalabras) {
		this.listarpalabras = listarpalabras;
	}

	public VentanaQuiz getQuiz() {
		return quiz;
	}

	public void setQuiz(VentanaQuiz quiz) {
		this.quiz = quiz;
	}

	public VentanaRegistroAdmon getRegistroadmin() {
		return registroadmin;
	}

	public void setRegistroadmin(VentanaRegistroAdmon registroadmin) {
		this.registroadmin = registroadmin;
	}


	

	// ////////////////////////////////////////////////////////

	public void MostrarLogin() {
		vistalogin.setVisible(true);
	}

	public void MostrarProfesor() {
		vistaprofesor.setVisible(true);
	}

	public void MostrarEstudiante() {
		vistaestudiante.setVisible(true);
	}

	public void MostrarAdmin() {
		vistaadmon.setVisible(true);
	}
	
	public void MostrarRegistro() {
		vistalogin.setVisible(true);
	}

	public void RegistrarUsuario(DatosVO datos) {
		modelobd.InsertarUsuario(datos);
	}

	public void RegistrarPalabra(DatosVO datos) {
		modeloestu.InsertarPalabras(datos);
	}

	public void ActualizarDatos(DatosVO datos) {
		modelobd.Actualizar(datos);
	}

	public void ListarPalabras(String nick) {
		modeloestu.getPalabras(nick);
	}

	public void ListarUsuarios() {
		modelobd.getUsers();
	}

	public void Quiz() {
		modeloestu.GenerarQuiz();
	}

	public double ResultsQuiz() {
		return modeloprofesor.ResultadosQuiz();
	}

	public void ListarEstudiantes(String curso) {
		modeloprofesor.ListarEstudiantes();
	}

	public void EliminarUsers(String id) {
		modelobd.EliminarUsuario(id);
	}

	public void EliminarPalabra(String pal) {
		modelobd.EliminarUsuario(pal);
	}

	public ModelEstudiante getModeloestu() {
		return modeloestu;
	}

	
}
