package co.edu.unbosque.Bitacora.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Font;

import javax.swing.JMenuItem;

import co.edu.unbosque.Bitacora.Model.MySQLDatosDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ProfesorView extends JFrame {

	private JPanel ActividadProfePane;
	private VentanaConsultaCursos VistaCursos;
	private JDesktopPane PanelActividadesProfe;

	public ProfesorView() {
		initcomponents();
		
	}
	
	public void initcomponents(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProfesorView.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setTitle("Actividad de Profesor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 500);
		ActividadProfePane = new JPanel();
		ActividadProfePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ActividadProfePane.setLayout(new BorderLayout(0, 0));
		setContentPane(ActividadProfePane);
		
		PanelActividadesProfe = new JDesktopPane();
		PanelActividadesProfe.setBackground(SystemColor.inactiveCaption);
		ActividadProfePane.add(PanelActividadesProfe, BorderLayout.CENTER);
		
		JMenuBar BarraMenuProfe = new JMenuBar();
		BarraMenuProfe.setBounds(0, 0, 792, 21);
		PanelActividadesProfe.add(BarraMenuProfe);
		
		JMenu menuConsultas = new JMenu("Consulta");
		menuConsultas.setFont(new Font("Arial", Font.BOLD, 12));
		BarraMenuProfe.add(menuConsultas);
		
		JMenuItem menuCursos = new JMenuItem("Cursos");
		menuCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaConsulta();
			}
		});
		menuCursos.setFont(new Font("Arial", Font.BOLD, 12));
		menuConsultas.add(menuCursos);
		
		JMenu mnMen = new JMenu("Men\u00FA");
		mnMen.setFont(new Font("Arial", Font.BOLD, 12));
		BarraMenuProfe.add(mnMen);
		
		JMenuItem menusalirprofe = new JMenuItem("Salir");
		menusalirprofe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				log.setVisible(true);
				dispose();
			}
		});
		menusalirprofe.setFont(new Font("Arial", Font.BOLD, 12));
		mnMen.add(menusalirprofe);
	}
	
	private void VentanaConsulta() {
		if (VistaCursos == null || VistaCursos.isClosed()) {
			VistaCursos = new VentanaConsultaCursos();
			PanelActividadesProfe.add(VistaCursos);
			Dimension desktopSize = PanelActividadesProfe.getSize();
			Dimension jInternalFrameSize = VistaCursos.getSize();
			int width = (desktopSize.width - jInternalFrameSize.width) / 2;
			int height = (desktopSize.height - jInternalFrameSize.height) / 2;
			VistaCursos.setLocation(width, height);
			VistaCursos.setVisible(true);

		}
	}

}
