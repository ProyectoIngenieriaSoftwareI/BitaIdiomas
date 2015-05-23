package co.edu.unbosque.Bitacora.View;

import java.awt.BorderLayout;
import co.edu.unbosque.Bitacora.Controller.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class registroadmon extends JFrame {

	private JPanel contentPane;
	private JTextField nombreRegistroAdministrador;
	private JPasswordField CampoContraseñaAdministrador;
	private JPasswordField CampoVerificarContraseñaAdministrador;

	public registroadmon() {
		setTitle("Registro ADMINISTRADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombreRegistroAdministrador = new JTextField();
		nombreRegistroAdministrador.setBounds(150, 11, 190, 20);
		contentPane.add(nombreRegistroAdministrador);
		nombreRegistroAdministrador.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 12));
		lblNombre.setBounds(45, 14, 51, 14);
		contentPane.add(lblNombre);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setFont(new Font("Arial", Font.BOLD, 12));
		lblContrasena.setBounds(32, 132, 73, 14);
		contentPane.add(lblContrasena);
		
		JLabel lblRepetirContrasea = new JLabel("Compruebe contrase\u00F1a:");
		lblRepetirContrasea.setFont(new Font("Arial", Font.BOLD, 12));
		lblRepetirContrasea.setBounds(10, 168, 137, 14);
		contentPane.add(lblRepetirContrasea);
		
		CampoContraseñaAdministrador = new JPasswordField();
		CampoContraseñaAdministrador.setBounds(150, 130, 190, 20);
		contentPane.add(CampoContraseñaAdministrador);
		
		CampoVerificarContraseñaAdministrador = new JPasswordField();
		CampoVerificarContraseñaAdministrador.setBounds(150, 166, 190, 20);
		contentPane.add(CampoVerificarContraseñaAdministrador);
		
		TextField apellidoRegistroAdministrador = new TextField();
		apellidoRegistroAdministrador.setBounds(150, 47, 190, 22);
		contentPane.add(apellidoRegistroAdministrador);
		
		TextField CampoNombreUsuarioAdministrador = new TextField();
		CampoNombreUsuarioAdministrador.setBounds(150, 86, 190, 22);
		contentPane.add(CampoNombreUsuarioAdministrador);
		
		JComboBox listaTipoUsuario = new JComboBox();
		listaTipoUsuario.setModel(new DefaultComboBoxModel(new String[] {"Elija un tipo", "Estudiante\t", "Profesor"}));
		listaTipoUsuario.setBounds(251, 209, 89, 20);
		contentPane.add(listaTipoUsuario);
		
		JButton botonRegistrarAdministrador = new JButton("Registrar");
		botonRegistrarAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre = nombreRegistroAdministrador.getText();
				String pass = CampoContraseñaAdministrador.getText();
				String apell = apellidoRegistroAdministrador.getText();
				String nombreUsuario = CampoNombreUsuarioAdministrador.getText();
				int selecciondelista = listaTipoUsuario.getSelectedIndex();
				System.out.println(selecciondelista);
				String tipousuario="";
				if(selecciondelista==2){
					tipousuario="1";
				}else if(selecciondelista==1){
					tipousuario="2";
				}
				registro r1 = new registro();
				r1.registrarUsuario(nombre, pass, apell, nombreUsuario, tipousuario);
				
			}
			
		});
		botonRegistrarAdministrador.setBounds(251, 258, 89, 23);
		contentPane.add(botonRegistrarAdministrador);
		
		
		
		Label lblApellido = new Label("Apellido:");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 12));
		lblApellido.setBounds(45, 47, 62, 22);
		contentPane.add(lblApellido);
		
		Label label = new Label("Nombre de Usuario:");
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setBounds(10, 86, 115, 22);
		contentPane.add(label);
		
		
		
		
	}
}


