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
	private VentanaAñadirBitacora ventana_español;
	private VentanaConsultaPalabra ventana_consulta;
	private VentanaQuiz ventana_quiz;
	private JDesktopPane panelactividades;

	public EstudianteView() {
		initComponents();
	}
	
	private void initComponents(){
		setTitle("Actividad de Estudiante");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EstudianteView.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 492);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menubitacoras = new JMenu("Bitacora");
		menubitacoras.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(menubitacoras);
		
		JMenuItem menuespañol = new JMenuItem("Espa\u00F1ol");
		menuespañol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ventana_español==null || ventana_español.isClosed()){
						ventana_español = new VentanaAñadirBitacora();
					}
					panelactividades.add(ventana_español);
					Dimension desktopSize = panelactividades.getSize();
				    Dimension jInternalFrameSize = ventana_español.getSize();
				    int width = (desktopSize.width - jInternalFrameSize.width) / 2;
				    int height = (desktopSize.height - jInternalFrameSize.height) / 2;
				    ventana_español.setLocation(width, height);
				    ventana_español.setVisible(true);
				}
			}
		);
		menuespañol.setFont(new Font("Arial", Font.BOLD, 12));
		menubitacoras.add(menuespañol);
		
		JMenuItem menuingles = new JMenuItem("English");
		menuingles.setFont(new Font("Arial", Font.BOLD, 12));
		menubitacoras.add(menuingles);
		
		JMenuItem menutibetano = new JMenuItem("\u0F56\u0F7C\u0F51\u0F0B\u0F66\u0F90\u0F51 ");
		menutibetano.setFont(new Font("Arial", Font.BOLD, 12));
		menubitacoras.add(menutibetano);
		
		JMenuItem menufrances = new JMenuItem("Fran\u00E7ais");
		menufrances.setFont(new Font("Arial", Font.BOLD, 12));
		menubitacoras.add(menufrances);
		
		JMenu menuquiz = new JMenu("Quiz");
		menuquiz.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(menuquiz);
		
		JMenuItem quizespañol = new JMenuItem("Espa\u00F1ol");
		quizespañol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ventana_quiz==null || ventana_quiz.isClosed()){
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
			}
		);
		quizespañol.setFont(new Font("Arial", Font.BOLD, 12));
		menuquiz.add(quizespañol);
		
		JMenuItem quizingles = new JMenuItem("English");
		quizingles.setFont(new Font("Arial", Font.BOLD, 12));
		menuquiz.add(quizingles);
		
		JMenuItem quiztibetano = new JMenuItem("\u0F56\u0F7C\u0F51\u0F0B\u0F66\u0F90\u0F51 ");
		quiztibetano.setFont(new Font("Arial", Font.BOLD, 12));
		menuquiz.add(quiztibetano);
		
		JMenuItem quizfrances = new JMenuItem("Fran\u00E7ais");
		quizfrances.setFont(new Font("Arial", Font.BOLD, 12));
		menuquiz.add(quizfrances);
		
		JMenu listarpalabras = new JMenu("Consultar");
		listarpalabras.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(listarpalabras);
		
		JMenuItem mntmListaPalabrasAgregadas = new JMenuItem("Lista palabras agregadas");
		mntmListaPalabrasAgregadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ventana_consulta==null || ventana_consulta.isClosed()){
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
		});
		mntmListaPalabrasAgregadas.setFont(new Font("Arial", Font.BOLD, 12));
		listarpalabras.add(mntmListaPalabrasAgregadas);
		actividadpane = new JPanel();
		actividadpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(actividadpane);
		actividadpane.setLayout(new BorderLayout(0, 0));
		
		panelactividades = new JDesktopPane();
		panelactividades.setBackground(SystemColor.inactiveCaption);
		actividadpane.add(panelactividades, BorderLayout.CENTER);
	}
}
