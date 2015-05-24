package co.edu.unbosque.Bitacora.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JDesktopPane;

import java.awt.SystemColor;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import co.edu.unbosque.Bitacora.Controller.CoordinadorController;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminView extends JFrame {

	private JPanel contentPane;
	private VentanaRegistroAdmon ventanaregistroadmin;
	private JDesktopPane panelactividadesadmon;
	private VentanaActualizarUsuarios ventanaactualizar;
	private CoordinadorController coordinador;

	
	public AdminView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminView.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setTitle("Actividades Administrador\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panelactividadesadmon = new JDesktopPane();
		panelactividadesadmon.setBackground(SystemColor.inactiveCaption);
		contentPane.add(panelactividadesadmon, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 840, 21);
		panelactividadesadmon.add(menuBar);
		
		JMenu mnGestinDelSistema = new JMenu("Gesti\u00F3n del Sistema");
		mnGestinDelSistema.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnGestinDelSistema);
		
		JMenuItem MenuInsertar = new JMenuItem("Insertar Usuario");
		MenuInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaRegistro();
			}
		});
		MenuInsertar.setFont(new Font("Arial", Font.BOLD, 12));
		mnGestinDelSistema.add(MenuInsertar);
		
		JMenuItem menuListar = new JMenuItem("Actualizar Usuarios");
		menuListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaActualizar();
			}
		});
		menuListar.setFont(new Font("Arial", Font.BOLD, 12));
		mnGestinDelSistema.add(menuListar);
		
		JMenu mnMen = new JMenu("Men\u00FA");
		mnMen.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnMen);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login log = new Login();
				log.setVisible(true);
				dispose();
			}
		});
		mntmSalir.setFont(new Font("Arial", Font.BOLD, 12));
		mnMen.add(mntmSalir);
	}
	private void VentanaRegistro() {
		if (ventanaregistroadmin == null || ventanaregistroadmin.isClosed()) {
			ventanaregistroadmin = new VentanaRegistroAdmon();
			panelactividadesadmon.add(ventanaregistroadmin);
			Dimension desktopSize = panelactividadesadmon.getSize();
			Dimension jInternalFrameSize = ventanaregistroadmin.getSize();
			int width = (desktopSize.width - jInternalFrameSize.width) / 2;
			int height = (desktopSize.height - jInternalFrameSize.height) / 2;
			ventanaregistroadmin.setLocation(width, height);
			ventanaregistroadmin.setVisible(true);

		}
	}
	private void VentanaActualizar() {
		if (ventanaactualizar == null || ventanaactualizar.isClosed()) {
			ventanaactualizar = new VentanaActualizarUsuarios();
			panelactividadesadmon.add(ventanaactualizar);
			Dimension desktopSize = panelactividadesadmon.getSize();
			Dimension jInternalFrameSize = ventanaactualizar.getSize();
			int width = (desktopSize.width - jInternalFrameSize.width) / 2;
			int height = (desktopSize.height - jInternalFrameSize.height) / 2;
			ventanaactualizar.setLocation(width, height);
			ventanaactualizar.setVisible(true);

		}
	}
	public void setCoordinador(CoordinadorController coordinador) {
		this.coordinador=coordinador;
	}
}
