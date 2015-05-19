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

public class RegistroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField nombreRegistro;
	private JPasswordField CampoContraseña;
	private JPasswordField CampoVerificarContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuario frame = new RegistroUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroUsuario() {
		setTitle("Registro de Estudiante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nombreRegistro = new JTextField();
		nombreRegistro.setBounds(150, 11, 190, 20);
		contentPane.add(nombreRegistro);
		nombreRegistro.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(50, 14, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(50, 54, 73, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a:");
		lblRepetirContrasea.setBounds(50, 97, 101, 14);
		contentPane.add(lblRepetirContrasea);
		
		CampoContraseña = new JPasswordField();
		CampoContraseña.setBounds(150, 51, 190, 20);
		contentPane.add(CampoContraseña);
		
		CampoVerificarContraseña = new JPasswordField();
		CampoVerificarContraseña.setBounds(150, 94, 190, 20);
		contentPane.add(CampoVerificarContraseña);
		
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre = nombreRegistro.getText();
				String pass = CampoContraseña.getText();
				registro r1 = new registro();
				r1.registrarUsuario(nombre, pass);
				
			}
			
		});
		botonRegistrar.setBounds(251, 145, 89, 23);
		contentPane.add(botonRegistrar);
	}
}
