package co.edu.unbosque.Bitacora.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import java.awt.SystemColor;
import java.beans.PropertyVetoException;

import javax.swing.BoxLayout;

public class EstudianteView extends JFrame {

	private JPanel actividadpane;
	private VentanaAñadirBitacora ventanaBitacora;
	private VentanaConsultaPalabra ventana_consulta;
	private VentanaQuiz ventana_quiz;
	private JDesktopPane panelactividades;
	private JMenuItem listaIngles;
	private JMenuItem listaEspañol;
	private JMenuItem listaTibetano;
	private JMenuItem listaFrances;
	private static final String esp = "Español";
	private static final String in = "Ingles";
	private static final String tibet = "Tibetano";
	private static final String fran = "Frances";
	public JMenuItem menuespañol;
	public JMenuItem menuingles;
	public JMenuItem menutibetano;
	public JMenuItem menufrances;
	private static String idiomaorigen = "";




	public EstudianteView() {
		initComponents();
	}
	private void VentanasBitacora() {
		if (ventanaBitacora == null || ventanaBitacora.isClosed()) {
			ventanaBitacora = new VentanaAñadirBitacora();
			panelactividades.add(ventanaBitacora);
			Dimension desktopSize = panelactividades.getSize();
			Dimension jInternalFrameSize = ventanaBitacora.getSize();
			int width = (desktopSize.width - jInternalFrameSize.width) / 2;
			int height = (desktopSize.height - jInternalFrameSize.height) / 2;
			ventanaBitacora.setLocation(width, height);
			ventanaBitacora.setVisible(true);

		}
	}

	private void VentanasQuiz() {
		if (ventana_quiz == null || ventana_quiz.isClosed()) {
			ventana_quiz = new VentanaQuiz();
			panelactividades.add(ventana_quiz);
			Dimension desktopSize = panelactividades.getSize();
			Dimension jInternalFrameSize = ventana_quiz.getSize();
			int width = (desktopSize.width - jInternalFrameSize.width) / 2;
			int height = (desktopSize.height - jInternalFrameSize.height) / 2;
			ventana_quiz.setLocation(width, height);
			ventana_quiz.show();
		}
	}

	private void VentanasConsulta() {
		if (ventana_consulta == null || ventana_consulta.isClosed()) {
			ventana_consulta = new VentanaConsultaPalabra();
			panelactividades.add(ventana_consulta);
			Dimension desktopSize = panelactividades.getSize();
			Dimension jInternalFrameSize = ventana_consulta.getSize();
			int width = (desktopSize.width - jInternalFrameSize.width) / 2;
			int height = (desktopSize.height - jInternalFrameSize.height) / 2;
			ventana_consulta.setLocation(width, height);
			ventana_consulta.show();
		}
	}

	private void initComponents() {
		setTitle("Actividad de Estudiante");
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						EstudianteView.class
								.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 500);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menubitacoras = new JMenu("Bitacora");
		menubitacoras.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(menubitacoras);

		menuespañol = new JMenuItem("Espa\u00F1ol");
		menuespañol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanasBitacora();
				ventanaBitacora.cambiarIdioma(esp);

			}
		});
		menuespañol.setFont(new Font("Arial", Font.BOLD, 12));
		menubitacoras.add(menuespañol);

		menuingles = new JMenuItem("English");
		menuingles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanasBitacora();
				ventanaBitacora.cambiarIdioma(in);
			}
		});
		menuingles.setFont(new Font("Arial", Font.BOLD, 12));
		menubitacoras.add(menuingles);

		menutibetano = new JMenuItem(
				"\u0F56\u0F7C\u0F51\u0F0B\u0F5F\u0FB3");
		menutibetano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanasBitacora();
				ventanaBitacora.cambiarIdioma(tibet);
			}
		});
		menutibetano.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		menubitacoras.add(menutibetano);

		menufrances = new JMenuItem("Fran\u00E7ais");
		menufrances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanasBitacora();
				ventanaBitacora.cambiarIdioma(fran);
			}
		});
		menufrances.setFont(new Font("Arial", Font.BOLD, 12));
		menubitacoras.add(menufrances);

		JMenu menuquiz = new JMenu("Quiz");
		menuquiz.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(menuquiz);

		JMenuItem quizespañol = new JMenuItem("Espa\u00F1ol");
		quizespañol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanasQuiz();
				ventana_quiz.cambiarIdiomaQuiz(esp);

			}
		});
		quizespañol.setFont(new Font("Arial", Font.BOLD, 12));
		menuquiz.add(quizespañol);

		JMenuItem quizingles = new JMenuItem("English");
		quizingles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanasQuiz();
				ventana_quiz.cambiarIdiomaQuiz(in);

			}
		});
		quizingles.setFont(new Font("Arial", Font.BOLD, 12));
		menuquiz.add(quizingles);

		JMenuItem quiztibetano = new JMenuItem(
				"\u0F56\u0F7C\u0F51\u0F0B\u0F66\u0F90\u0F51");
		quiztibetano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanasQuiz();
				ventana_quiz.cambiarIdiomaQuiz(tibet);

			}
		});
		quiztibetano.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		menuquiz.add(quiztibetano);

		JMenuItem quizfrances = new JMenuItem("Fran\u00E7ais");
		quizfrances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanasQuiz();
				ventana_quiz.cambiarIdiomaQuiz(fran);

			}
		});
		quizfrances.setFont(new Font("Arial", Font.BOLD, 12));
		menuquiz.add(quizfrances);

		JMenu listarpalabras = new JMenu("Consultar");
		listarpalabras.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(listarpalabras);

		listaEspañol = new JMenuItem("Palabras Espa\u00F1ol");
		listaEspañol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanasConsulta();
				ventana_consulta.cambiarIdiomaConsulta(esp);
			}
		});
		listaEspañol.setFont(new Font("Arial", Font.BOLD, 12));
		listarpalabras.add(listaEspañol);

		listaIngles = new JMenuItem("English Words");
		listaIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanasConsulta();
				ventana_consulta.cambiarIdiomaConsulta(in);
			}
		});
		listaIngles.setFont(new Font("Arial", Font.BOLD, 12));
		listarpalabras.add(listaIngles);

		listaTibetano = new JMenuItem(
				"\u0F5A\u0F72\u0F42 \u0F56\u0F7C\u0F51\u0F0B\u0F66\u0F90\u0F51");
		listaTibetano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanasConsulta();
				ventana_consulta.cambiarIdiomaConsulta(tibet);
			}
		});
		listaTibetano.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		listarpalabras.add(listaTibetano);

		listaFrances = new JMenuItem("Mots en Fran\u00E7ais");
		listaFrances.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanasConsulta();
				ventana_consulta.cambiarIdiomaConsulta(fran);
			}
		});
		listaFrances.setFont(new Font("Arial", Font.BOLD, 12));
		listarpalabras.add(listaFrances);
		
		JMenu mnNewMenu = new JMenu("Men\u00FA");
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				log.setVisible(true);
				dispose();
			}
		});
		mntmSalir.setFont(new Font("Arial", Font.BOLD, 12));
		mnNewMenu.add(mntmSalir);
		actividadpane = new JPanel();
		actividadpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(actividadpane);
		actividadpane.setLayout(new BorderLayout(0, 0));

		panelactividades = new JDesktopPane();
		panelactividades.setBackground(SystemColor.inactiveCaption);
		actividadpane.add(panelactividades, BorderLayout.CENTER);
	}
}
