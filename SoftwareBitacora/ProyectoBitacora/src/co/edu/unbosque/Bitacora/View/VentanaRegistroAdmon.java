package co.edu.unbosque.Bitacora.View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import co.edu.unbosque.Bitacora.Controller.CoordinadorController;
import co.edu.unbosque.Bitacora.Model.DatosVO;
import co.edu.unbosque.Bitacora.Model.MySQLDatosDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaRegistroAdmon extends JInternalFrame {
	private JButton botonregistroadmon;
	private JPasswordField campocontraseña1admon;
	private JPasswordField campocontraseña2admon;
	private JComboBox comboBoxTipoInsertar;
	private JLabel labelcontraadmon;
	private String pass;
	private JTextField camponombreadmon;
	private JTextField campoapellidoadmon;
	private JTextField camponickadmon;
	private CoordinadorController coordinador;
	
	public VentanaRegistroAdmon() {
		initcomponents();

	}

	public void limpiar(){
		campocontraseña1admon.setText("");
		campocontraseña2admon.setText("");
		camponombreadmon.setText("");
		campoapellidoadmon.setText("");
		camponickadmon.setText("");
		comboBoxTipoInsertar.setSelectedIndex(0);
	}
	
	public void setCoordinador(CoordinadorController coordinador) {
		this.coordinador=coordinador;
	}
	
	public void initcomponents(){
		setFrameIcon(new ImageIcon(VentanaRegistroAdmon.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setClosable(true);
		setIconifiable(true);
		setTitle("Insertar Usuarios");
		setBounds(100, 100, 550, 380);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 13));
		lblNombre.setBounds(117, 25, 79, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 13));
		lblApellido.setBounds(117, 59, 79, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setFont(new Font("Arial", Font.BOLD, 13));
		lblNombreDeUsuario.setBounds(61, 94, 135, 14);
		getContentPane().add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Arial", Font.BOLD, 13));
		lblContrasea.setBounds(100, 130, 79, 14);
		getContentPane().add(lblContrasea);
		
		JLabel lblVerifiqueContrasea = new JLabel("Verifique Contrase\u00F1a:");
		lblVerifiqueContrasea.setFont(new Font("Arial", Font.BOLD, 13));
		lblVerifiqueContrasea.setBounds(46, 168, 150, 14);
		getContentPane().add(lblVerifiqueContrasea);
		
		camponombreadmon = new JTextField();
		camponombreadmon.setBounds(206, 23, 200, 20);
		getContentPane().add(camponombreadmon);
		camponombreadmon.setColumns(10);
		
		campoapellidoadmon = new JTextField();
		campoapellidoadmon.setColumns(10);
		campoapellidoadmon.setBounds(206, 53, 200, 20);
		getContentPane().add(campoapellidoadmon);
		
		camponickadmon = new JTextField();
		camponickadmon.setColumns(10);
		camponickadmon.setBounds(206, 92, 200, 20);
		getContentPane().add(camponickadmon);
		
		comboBoxTipoInsertar = new JComboBox();
		comboBoxTipoInsertar.setModel(new DefaultComboBoxModel(new String[] {"Elija un tipo de usuario....", "Profesor", "Estudiante"}));
		comboBoxTipoInsertar.setFont(new Font("Arial", Font.BOLD, 12));
		comboBoxTipoInsertar.setBounds(241, 227, 165, 20);
		getContentPane().add(comboBoxTipoInsertar);
		
		botonregistroadmon = new JButton("Registrar Usuario");
		botonregistroadmon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 	if(campocontraseña1admon.getText().equals(campocontraseña2admon.getText())){
			 	DatosVO v1 = new DatosVO();
			 	v1.setNombre(camponombreadmon.getText());;
			 	v1.setPassword(campocontraseña1admon.getText());
			 	v1.setApellido(campoapellidoadmon.getText());
			 	v1.setUsuario(camponickadmon.getText());
			 	int selecciondelista = comboBoxTipoInsertar.getSelectedIndex();
			 	String tipousuario="";
			 	if(selecciondelista==2){
			 	v1.setTipoUsuario("2");
			 	}else if(selecciondelista==1){
			 	v1.setTipoUsuario("1");
			 	}
			 	MySQLDatosDAO r1 = new MySQLDatosDAO();
			 	r1.InsertarUsuario(v1);
			 	//coordinador.RegistrarUsuario(v1);
			 	
			 	limpiar();
			 	}
			 	else{
			 	JOptionPane.showMessageDialog(null,
			 	"Las contraseñas no coinciden. Inténtelo de nuevo",
			 	"Pass Error",
			 	JOptionPane.ERROR_MESSAGE);
			 	}
			 	 
			 	}
		});
		botonregistroadmon.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonregistroadmon.setBounds(83, 300, 135, 23);
		getContentPane().add(botonregistroadmon);
		
		campocontraseña1admon = new JPasswordField();
		campocontraseña1admon.setBounds(206, 128, 200, 20);
		getContentPane().add(campocontraseña1admon);
		
		campocontraseña2admon = new JPasswordField();
		campocontraseña2admon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (campocontraseña1admon.getText().equals(campocontraseña2admon.getText())) {
		            labelcontraadmon.setForeground(new java.awt.Color(0, 255, 0));
		            labelcontraadmon.setText("Conciden");
		        } else {
		        	labelcontraadmon.setForeground(new java.awt.Color(255, 0, 0));
		        	labelcontraadmon.setText("No Conciden");
		             }
			}
		});
		campocontraseña2admon.setBounds(206, 166, 200, 20);
		getContentPane().add(campocontraseña2admon);
		
		labelcontraadmon = new JLabel("");
		labelcontraadmon.setFont(new Font("Arial Black", Font.BOLD, 11));
		labelcontraadmon.setBounds(416, 172, 108, 14);
		getContentPane().add(labelcontraadmon);
	}
}
