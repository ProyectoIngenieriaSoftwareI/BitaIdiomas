package co.edu.unbosque.Bitacora.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaRecuperarContraseña extends JFrame {

	private JPanel contentPane;
	public static JTextField campocorreorecuperar;

	public VentanaRecuperarContraseña() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaRecuperarContraseña.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setTitle("Recuperar Contrase\u00F1a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelrecuperarpass = new JLabel("Ingrese el correo electr\u00F3nico asociado a su cuenta");
		labelrecuperarpass.setForeground(Color.DARK_GRAY);
		labelrecuperarpass.setFont(new Font("Arial Black", Font.BOLD, 13));
		labelrecuperarpass.setBounds(10, 48, 424, 46);
		contentPane.add(labelrecuperarpass);
		
		campocorreorecuperar = new JTextField();
		campocorreorecuperar.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		campocorreorecuperar.setBounds(83, 105, 276, 20);
		contentPane.add(campocorreorecuperar);
		campocorreorecuperar.setColumns(10);
		
		JButton btnEnviarCintraseaAl = new JButton("Enviar contrase\u00F1a al correo");
		btnEnviarCintraseaAl.setToolTipText("Si haz olvidado tu contrase\u00F1a, te la enviaremos al correo para que puedas ingresar a la aplicaci\u00F3n");
		btnEnviarCintraseaAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEnviarCintraseaAl.setBounds(106, 154, 221, 20);
		contentPane.add(btnEnviarCintraseaAl);
	}

}
