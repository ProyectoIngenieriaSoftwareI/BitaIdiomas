package co.edu.unbosque.Bitacora.View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class VentanaConsultaPalabra extends JInternalFrame {
	private JTable tablaconsultapalabras;

	public VentanaConsultaPalabra() {
		setTitle("Lista de Palabras Agregadas Bitacora\r\n");
		setClosable(true);
		setFrameIcon(new ImageIcon(VentanaConsultaPalabra.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 585, 377);
		getContentPane().setLayout(null);
		
		JLabel labellistarpalabras = new JLabel("Lista de palabras agregadas a la Bitacora ");
		labellistarpalabras.setFont(new Font("Arial", Font.BOLD, 12));
		labellistarpalabras.setBounds(10, 11, 247, 15);
		getContentPane().add(labellistarpalabras);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 37, 569, 310);
		getContentPane().add(scrollPane);
		
		tablaconsultapalabras = new JTable();
		tablaconsultapalabras.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		tablaconsultapalabras.setFont(new Font("Arial", Font.BOLD, 12));
		tablaconsultapalabras.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Espa\u00F1ol", "English", "Fran\u00E7ais", "\u0F56\u0F7C\u0F51\u0F0B\u0F66\u0F90\u0F51 "
			}
		));
		scrollPane.setViewportView(tablaconsultapalabras);

	}
}
