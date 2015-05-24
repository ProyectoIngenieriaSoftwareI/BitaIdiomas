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

public class RegistroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField nombreRegistro;
	private JPasswordField CampoContraseña;
	private JPasswordField CampoVerificarContraseña;

	public RegistroUsuario() {
		setTitle("Registro de Estudiante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombreRegistro = new JTextField();
		nombreRegistro.setBounds(150, 11, 190, 20);
		contentPane.add(nombreRegistro);
		nombreRegistro.setColumns(10);
		
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
		
		CampoContraseña = new JPasswordField();
		CampoContraseña.setBounds(150, 130, 190, 20);
		contentPane.add(CampoContraseña);
		
		CampoVerificarContraseña = new JPasswordField();
		CampoVerificarContraseña.setBounds(150, 166, 190, 20);
		contentPane.add(CampoVerificarContraseña);
		
		TextField apellidoRegistro = new TextField();
		apellidoRegistro.setBounds(150, 47, 190, 22);
		contentPane.add(apellidoRegistro);
		
		TextField CampoNombreUsuario = new TextField();
		CampoNombreUsuario.setBounds(150, 86, 190, 22);
		contentPane.add(CampoNombreUsuario);
		
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre = nombreRegistro.getText();
				String pass = CampoContraseña.getText();
				String apell = apellidoRegistro.getText();
				String nombreUsuario = CampoNombreUsuario.getText();
				String tipousuario = "2";
				registro r1 = new registro();
				r1.registrarUsuario(nombre, pass, apell, nombreUsuario, tipousuario);
				
			}
			
		});
		botonRegistrar.setBounds(138, 206, 89, 23);
		contentPane.add(botonRegistrar);
		
		
		
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
