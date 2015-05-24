package co.edu.unbosque.Bitacora.View;

import java.awt.BorderLayout;

import co.edu.unbosque.Bitacora.Controller.*;
import co.edu.unbosque.Bitacora.Model.MySQLDatosDAO;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegistroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField camponombreestu;
	private JPasswordField CampoContraseña;
	private JPasswordField CampoVerificarContraseña;
	private JLabel labelcoincideestu;
	private TextField campoapellidoestu;
	private TextField CampoNombreUsuario;

	public RegistroUsuario() {
		setTitle("Registro de Estudiante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		camponombreestu = new JTextField();
		camponombreestu.setBounds(150, 11, 190, 20);
		contentPane.add(camponombreestu);
		camponombreestu.setColumns(10);
		
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
		CampoVerificarContraseña.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (CampoContraseña.getText().equals(CampoVerificarContraseña.getText())) {
		            labelcoincideestu.setForeground(new java.awt.Color(0, 255, 0));
		            labelcoincideestu.setText("Conciden");
		        } else {
		        	labelcoincideestu.setForeground(new java.awt.Color(255, 0, 0));
		        	labelcoincideestu.setText("No Conciden");
		        }
			}
		});
		CampoVerificarContraseña.setBounds(150, 166, 190, 20);
		contentPane.add(CampoVerificarContraseña);
		
		campoapellidoestu = new TextField();
		campoapellidoestu.setBounds(150, 47, 190, 22);
		contentPane.add(campoapellidoestu);
		
		CampoNombreUsuario = new TextField();
		CampoNombreUsuario.setBounds(150, 86, 190, 22);
		contentPane.add(CampoNombreUsuario);
		
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre = camponombreestu.getText();
				String pass = CampoContraseña.getText();
				String apell = campoapellidoestu.getText();
				String nombreUsuario = CampoNombreUsuario.getText();
				String tipousuario = "2";
				MySQLDatosDAO r1 = new 	MySQLDatosDAO();
				r1.InsertarUsuario(nombre, pass, apell, nombreUsuario, tipousuario);
				limpiar();
				
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
		
		labelcoincideestu = new JLabel("");
		labelcoincideestu.setFont(new Font("Arial Black", Font.BOLD, 11));
		labelcoincideestu.setBounds(342, 168, 86, 14);
		contentPane.add(labelcoincideestu);
		
		JButton botonvolver = new JButton("Volver");
		botonvolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login log=new Login();
				log.setVisible(true);
				dispose();
			}
		});
		botonvolver.setFont(new Font("Times New Roman", Font.BOLD, 12));
		botonvolver.setBounds(312, 206, 89, 23);
		contentPane.add(botonvolver);
		
		
	}
	public void limpiar(){
		camponombreestu.setText("");
		campoapellidoestu.setText("");
		CampoNombreUsuario.setText("");
		CampoContraseña.setText("");
		CampoVerificarContraseña.setText("");

		
	}
}
