package co.edu.unbosque.Bitacora.Model;

import java.util.*;

import co.edu.unbosque.Bitacora.Controller.CoordinadorController;

/**
 * 
 */
public class ModelProfesor extends BitacoraModel {

    private CoordinadorController coordinador;

	/**
     * 
     */
    public ModelProfesor() {
    }

    /**
     * @return
     */
    public double ResultadosQuiz() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * 
     */
    public void ListarEstudiantes() {
        // TODO implement here
    }
    
    public void setCoordinador(CoordinadorController coordinador) {
		this.coordinador=coordinador;
	}

}