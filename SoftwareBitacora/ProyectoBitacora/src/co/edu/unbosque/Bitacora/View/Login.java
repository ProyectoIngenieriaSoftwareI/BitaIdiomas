package co.edu.unbosque.Bitacora.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

import co.edu.unbosque.Bitacora.Controller.*;
import co.edu.unbosque.Bitacora.Model.ModelLogin;
public class Login extends JFrame {

	private JPanel contentPane;
	public static JTextField campousuario;
	public static JPasswordField campocontraseña;

	public Login() {
		initComponents();
		
	}

	private void initComponents(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setTitle("Ingreso a Bitacora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblcontraseña = new JLabel("CONTRASE\u00D1A:");
		lblcontraseña
				.setIcon(new ImageIcon(
						Login.class
								.getResource("/co/edu/unbosque/Bitacora/Resources/icono-candado.png")));
		lblcontraseña.setForeground(Color.DARK_GRAY);
		lblcontraseña.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblcontraseña.setBounds(54, 121, 172, 50);
		contentPane.add(lblcontraseña);

		JLabel lblUsuario = new JLabel("USUARIO: ");
		lblUsuario.setIcon(new ImageIcon(Login.class
				.getResource("/co/edu/unbosque/Bitacora/Resources/user.png")));
		lblUsuario.setForeground(Color.DARK_GRAY);
		lblUsuario.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblUsuario.setBounds(54, 34, 157, 58);
		contentPane.add(lblUsuario);

		campousuario = new JTextField();
		campousuario
				.setToolTipText("Ingrese la cuenta de usuario registrada para el acceso a la Bitacora.");
		campousuario.setBounds(244, 54, 157, 20);
		contentPane.add(campousuario);
		campousuario.setColumns(10);

		campocontraseña = new JPasswordField();
		campocontraseña
				.setToolTipText("Ingrese la contrase\u00F1a asignada a su cuenta.");
		campocontraseña.setBounds(244, 137, 157, 20);
		contentPane.add(campocontraseña);

		JButton botonIngresar = new JButton("Ingresar");
		botonIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = campousuario.getText();
				String contraseña = campocontraseña.getText();
				  ModelLogin m1 = new ModelLogin();
				  m1.ValidarLogin(usuario, contraseña);
			}
		});
		botonIngresar
				.setToolTipText("Si ya ingresaste los datos correspondientes a tu usuario y tu contrae\u00F1a, ingresa a nuestro software de gestion de Bitacoras.");
		botonIngresar.setForeground(Color.DARK_GRAY);
		botonIngresar.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		botonIngresar.setBounds(120, 192, 89, 23);
		contentPane.add(botonIngresar);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroUsuario registro = new RegistroUsuario();
				
			
				registro.setVisible(true);
			}
		});
		btnRegistrarse
				.setToolTipText("\u00BFA\u00FAn no tienes cuenta? Haz clic en el bot\u00F3n para crear tu cuenta de usuario.");
		btnRegistrarse.setForeground(Color.DARK_GRAY);
		btnRegistrarse.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		btnRegistrarse.setBounds(262, 192, 89, 23);
		contentPane.add(btnRegistrarse);
		
	}
}
