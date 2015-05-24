package co.edu.unbosque.Bitacora.Controller;

import java.util.*;

import co.edu.unbosque.Bitacora.Model.BitacoraModel;
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


public class BitacoraIdiomas implements Observer {

	 ModelEstudiante modeloestu;
	 ModelLogin modelologin;
	 ModelProfesor modeloprofesor;
	 MySQLDatosDAO modelobd;
	 AdminView vistaadmon;
	 EstudianteView vistaestudiante;
	 Login vistalogin;
	 ProfesorView vistaprofesor;
	 RegistroUsuario registrousuario;
	 VentanaActualizarUsuarios actualizarusu;
	 VentanaAñadirBitacora registrarpalabra;
	 VentanaConsultaCursos listarcursos;
	 VentanaConsultaPalabra listarpalabras;
	 VentanaQuiz quiz;
	 VentanaRegistroAdmon registroadmin;
	 CoordinadorController coordinador;

	public static void main(String[] args) {
		BitacoraIdiomas bitacora=new BitacoraIdiomas();
		bitacora.iniciar();
	}
	
	
	private void iniciar() {
		/*Se instancian las clases*/
		modeloestu=new 	ModelEstudiante();
		modeloprofesor= new ModelProfesor();
		modelobd=new MySQLDatosDAO();
		modelologin=new ModelLogin();
		vistaadmon= new AdminView();
		vistaestudiante=new EstudianteView();
		vistaprofesor= new ProfesorView();
		vistalogin= new Login();
		registrousuario = new RegistroUsuario();
		actualizarusu = new VentanaActualizarUsuarios();
		registrarpalabra = new VentanaAñadirBitacora();
		listarcursos = new VentanaConsultaCursos();
		listarpalabras = new VentanaConsultaPalabra();
		quiz = new VentanaQuiz();
		registroadmin = new VentanaRegistroAdmon();
		coordinador= new CoordinadorController();
		
		
		/*Se establecen las relaciones entre clases*/
		vistaadmon.setCoordinador(coordinador);
		vistaestudiante.setCoordinador(coordinador);
		vistaprofesor.setCoordinador(coordinador);
		vistalogin.setCoordinador(coordinador);
		modeloestu.setCoordinador(coordinador);
		modeloprofesor.setCoordinador(coordinador);
		modelobd.setCoordinador(coordinador);
		modelologin.setCoordinador(coordinador);
		registrousuario.setCoordinador(coordinador);
		actualizarusu.setCoordinador(coordinador);
		registrarpalabra.setCoordinador(coordinador);
		listarcursos.setCoordinador(coordinador);
		listarpalabras.setCoordinador(coordinador);
		quiz.setCoordinador(coordinador);
		registroadmin.setCoordinador(coordinador);
		
		/*Se establecen relaciones con la clase coordinador*/
		coordinador.setVistalogin(vistalogin);
		coordinador.setVistaadmon(vistaadmon);
		coordinador.setVistaestudiante(vistaestudiante);
		coordinador.setVistaprofesor(vistaprofesor);
		coordinador.setModelobd(modelobd);
		coordinador.setModeloestu(modeloestu);
		coordinador.setModeloprofesor(modeloprofesor);
		coordinador.setModelobd(modelobd);
		coordinador.setRegistrarpalabra(registrarpalabra);
		coordinador.setRegistrousuario(registrousuario);
		coordinador.setRegistroadmin(registroadmin);
		coordinador.setQuiz(quiz);
		coordinador.setListarcursos(listarcursos);
		coordinador.setListarpalabras(listarpalabras);
		coordinador.setActualizarusu(actualizarusu);
		vistalogin.setVisible(true);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

}