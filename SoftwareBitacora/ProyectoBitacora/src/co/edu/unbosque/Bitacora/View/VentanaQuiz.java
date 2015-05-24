package co.edu.unbosque.Bitacora.View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.awt.BorderLayout;

import javax.swing.JLabel;

import co.edu.unbosque.Bitacora.Controller.CoordinadorController;

public class VentanaQuiz extends JInternalFrame {
	private JLabel lblquiz;
	private CoordinadorController coordinador;

	public VentanaQuiz() {
		initcomponents();
	}
	public void initcomponents(){
		setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		setFrameIcon(new ImageIcon(
				VentanaQuiz.class
						.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setTitle("\u0F62\u0F94\u0F0B\u0F56\u0F7C\u0F44");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 597, 347);
		
		lblquiz = new JLabel("New label");
		lblquiz.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblquiz, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addComponent(lblquiz)
					.addContainerGap(266, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	public void setCoordinador(CoordinadorController coordinador) {
		this.coordinador=coordinador;
	}
	
	public void cambiarIdiomaQuiz(String nombreIdioma) {

		try {

			Properties propiedades = new Properties();

			if (nombreIdioma.equals("Español")) {

				propiedades
						.load(new FileInputStream(
								"C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/espanol.properties"));

			}
			if (nombreIdioma.equals("Ingles")) {
				propiedades
						.load(new FileInputStream(
								"C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/ingles.properties"));
			}
			if (nombreIdioma.equals("Tibetano")) {
				propiedades
						.load(new FileInputStream(
								"C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/tibetano.properties"));
			} else if (nombreIdioma.equals("Frances")) {
				propiedades
						.load(new FileInputStream(
								"C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/frances.properties"));
			}

			this.setTitle(propiedades.getProperty("tituloquiz"));
			lblquiz.setText(propiedades.getProperty("labelquiz"));

		} catch (FileNotFoundException e) {
			System.out.println("Error, El archivo no exite");
		} catch (IOException e) {
			System.out.println("Error, No se puede leer el archivo");
		}

	}
}
