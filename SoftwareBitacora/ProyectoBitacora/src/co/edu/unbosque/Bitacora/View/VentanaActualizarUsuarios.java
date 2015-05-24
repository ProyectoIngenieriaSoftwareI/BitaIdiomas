package co.edu.unbosque.Bitacora.View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import co.edu.unbosque.Bitacora.Controller.CoordinadorController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaActualizarUsuarios extends JInternalFrame {
	private JTextField camponickact;
	private JTextField campocontraseñaact;
	private JTextField campoeliminarusuario;
	private JTextField campoapellidoact;
	private JTextField camponombreactualizar;
	private CoordinadorController coordinador;


	public VentanaActualizarUsuarios() {
		initcomponents();
	}
	public void limpiar(){
		camponickact.setText("");
		campocontraseñaact.setText("");
		campoapellidoact.setText("");
		camponombreactualizar.setText("");
	
	}
	public void setCoordinador(CoordinadorController coordinador) {
		this.coordinador=coordinador;
	}
	public void initcomponents(){
		setBounds(100, 100, 778, 495);
		setTitle("Actualizar Usuarios");
		setFrameIcon(new ImageIcon(VentanaActualizarUsuarios.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setIconifiable(true);
		setClosable(true);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 12));
		lblNombre.setBounds(10, 11, 70, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 12));
		lblApellido.setBounds(10, 47, 70, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		lblNombreDeUsuario.setBounds(10, 80, 122, 14);
		getContentPane().add(lblNombreDeUsuario);
		
		camponombreactualizar = new JTextField();
		camponombreactualizar.setFont(new Font("Arial", Font.PLAIN, 12));
		camponombreactualizar.setBounds(139, 9, 181, 20);
		getContentPane().add(camponombreactualizar);
		camponombreactualizar.setColumns(10);
		
		campoapellidoact = new JTextField();
		campoapellidoact.setFont(new Font("Arial", Font.PLAIN, 12));
		campoapellidoact.setColumns(10);
		campoapellidoact.setBounds(139, 45, 181, 20);
		getContentPane().add(campoapellidoact);
		
		camponickact = new JTextField();
		camponickact.setFont(new Font("Arial", Font.PLAIN, 12));
		camponickact.setColumns(10);
		camponickact.setBounds(139, 78, 181, 20);
		getContentPane().add(camponickact);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Arial", Font.BOLD, 12));
		lblContrasea.setBounds(10, 118, 70, 14);
		getContentPane().add(lblContrasea);
		
		campocontraseñaact = new JTextField();
		campocontraseñaact.setFont(new Font("Arial", Font.PLAIN, 12));
		campocontraseñaact.setColumns(10);
		campocontraseñaact.setBounds(139, 116, 181, 20);
		getContentPane().add(campocontraseñaact);
		
		JLabel lblDigiteIdDel = new JLabel("Digite ID del Usuario a Eliminar:");
		lblDigiteIdDel.setFont(new Font("Arial", Font.BOLD, 13));
		lblDigiteIdDel.setBounds(512, 35, 210, 14);
		getContentPane().add(lblDigiteIdDel);
		
		campoeliminarusuario = new JTextField();
		campoeliminarusuario.setFont(new Font("Arial", Font.PLAIN, 12));
		campoeliminarusuario.setColumns(10);
		campoeliminarusuario.setBounds(522, 60, 181, 20);
		getContentPane().add(campoeliminarusuario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 147, 768, 320);
		getContentPane().add(scrollPane);
		
		JTable tablausuarios = new JTable();
		tablausuarios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Apellido", "Nombre  Usuario", "Contrase\u00F1a", "Rol"
			}
		));
		tablausuarios.getColumnModel().getColumn(3).setPreferredWidth(89);
		tablausuarios.setFont(new Font("Arial", Font.PLAIN, 12));
		scrollPane.setViewportView(tablausuarios);
		
		JButton botoneliminar = new JButton("Eliminar");
		botoneliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				campoeliminarusuario.setText("");
			}
		});
		botoneliminar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		botoneliminar.setBounds(576, 91, 90, 20);
		getContentPane().add(botoneliminar);
		
		JButton botonactualizar = new JButton("Actualizar");
		botonactualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				limpiar();
			}
		});
		botonactualizar.setFont(new Font("Times New Roman", Font.BOLD, 13));
		botonactualizar.setBounds(356, 60, 100, 23);
		getContentPane().add(botonactualizar);


	}
}
