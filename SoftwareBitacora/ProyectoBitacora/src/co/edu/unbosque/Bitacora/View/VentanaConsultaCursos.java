package co.edu.unbosque.Bitacora.View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaConsultaCursos extends JInternalFrame {
	private JTextField campoConsultacursos;
	private JTable tablaconsultacursos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConsultaCursos frame = new VentanaConsultaCursos();
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
	public VentanaConsultaCursos() {
		setClosable(true);
		setFrameIcon(new ImageIcon(VentanaConsultaCursos.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setIconifiable(true);
		setTitle("Consulta de Cursos");
		setBounds(100, 100, 542, 300);
		getContentPane().setLayout(null);
		
		JLabel lblconsucursos = new JLabel("Ingrese nombre del curso");
		lblconsucursos.setFont(new Font("Arial", Font.BOLD, 13));
		lblconsucursos.setBounds(10, 11, 169, 14);
		getContentPane().add(lblconsucursos);
		
		campoConsultacursos = new JTextField();
		campoConsultacursos.setBounds(204, 9, 195, 20);
		getContentPane().add(campoConsultacursos);
		campoConsultacursos.setColumns(10);
		
		JButton btnconsultarcursos = new JButton("Consultar");
		btnconsultarcursos.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnconsultarcursos.setBounds(258, 32, 89, 23);
		getContentPane().add(btnconsultarcursos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 66, 526, 204);
		getContentPane().add(scrollPane);
		
		tablaconsultacursos = new JTable();
		tablaconsultacursos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "Update", "Nota Q1", "Nota Q2", "Nota Q3", "Nota Q4", "Nota Q5", "Nota Q6"
			}
		));
		tablaconsultacursos.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		scrollPane.setViewportView(tablaconsultacursos);

	}
}
