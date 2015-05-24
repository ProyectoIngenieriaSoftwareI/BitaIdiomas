package co.edu.unbosque.Bitacora.View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VentanaRegistroAdmon extends JInternalFrame {
	private JButton botonregistroadmon;
	private JComboBox comboBox;

	public VentanaRegistroAdmon() {
		initcomponents();

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
		
		JTextField camponombreadmon = new JTextField();
		camponombreadmon.setBounds(206, 23, 200, 20);
		getContentPane().add(camponombreadmon);
		camponombreadmon.setColumns(10);
		
		JTextField campoapellidoadmon = new JTextField();
		campoapellidoadmon.setColumns(10);
		campoapellidoadmon.setBounds(206, 53, 200, 20);
		getContentPane().add(campoapellidoadmon);
		
		JTextField camponickadmon = new JTextField();
		camponickadmon.setColumns(10);
		camponickadmon.setBounds(206, 92, 200, 20);
		getContentPane().add(camponickadmon);
		
		JTextField campocontrase�a1admon = new JTextField();
		campocontrase�a1admon.setColumns(10);
		campocontrase�a1admon.setBounds(206, 128, 200, 20);
		getContentPane().add(campocontrase�a1admon);
		
		JTextField campocontrase�a2admon = new JTextField();
		campocontrase�a2admon.setColumns(10);
		campocontrase�a2admon.setBounds(206, 166, 200, 20);
		getContentPane().add(campocontrase�a2admon);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elija un tipo de usuario....", "Profesor", "Estudiante"}));
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox.setBounds(241, 227, 165, 20);
		getContentPane().add(comboBox);
		
		botonregistroadmon = new JButton("Registrar Usuario");
		botonregistroadmon.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonregistroadmon.setBounds(83, 300, 135, 23);
		getContentPane().add(botonregistroadmon);
	}
	

}