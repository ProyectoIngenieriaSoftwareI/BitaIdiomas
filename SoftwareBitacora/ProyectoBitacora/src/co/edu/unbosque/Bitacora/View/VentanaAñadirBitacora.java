package co.edu.unbosque.Bitacora.View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAñadirBitacora extends JInternalFrame {

	private static int opc;

	private JTextField CampopalabraTraduccion;
	private JTextField campopalabra;
	private JComboBox comboBoxIdioma;
	private JLabel lblPalabra;
	private JLabel lblTraduccion;
	private JButton botonañadirpalabras;
	private JLabel lblañadirpalabra;

	public VentanaAñadirBitacora() {
		setIconifiable(true);
		setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		setResizable(true);
		initComponents();
	}

	private void initComponents() {
		setFrameIcon(new ImageIcon(
				VentanaAñadirBitacora.class
						.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setTitle("title");
		setClosable(true);
		setBounds(100, 100, 422, 395);

		lblañadirpalabra = new JLabel("a\u00F1adir");
		lblañadirpalabra.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));

		lblPalabra = new JLabel("pal");
		lblPalabra.setFont(new Font("Arial Unicode MS", Font.BOLD, 13));

		lblTraduccion = new JLabel("tra");
		lblTraduccion.setFont(new Font("Arial Unicode MS", Font.BOLD, 13));

		CampopalabraTraduccion = new JTextField();
		CampopalabraTraduccion.setColumns(10);

		campopalabra = new JTextField();
		campopalabra.setColumns(10);

		botonañadirpalabras = new JButton("boton a\u00F1adir");
		botonañadirpalabras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String IO = "";
				
				if (opc == 1) {
					IO = "Español";	
				} else if (opc == 2) {
					IO = "Ingles";
				} else if (opc == 3) {
					IO = "Tibetano";
				} else if (opc == 4) {
					IO = "Frances";
				}
				String ID =(String) comboBoxIdioma.getSelectedItem();
				System.out.println(IO+"\n"+ID);
				
			}
		});
		botonañadirpalabras
				.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));

		comboBoxIdioma = new JComboBox();
		comboBoxIdioma.setToolTipText("");
		comboBoxIdioma.setModel(new DefaultComboBoxModel(new String[] {
				"seleccion:", "es", "in", "ti", "fran" }));
		comboBoxIdioma.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(10)
										.addComponent(lblañadirpalabra,
												GroupLayout.DEFAULT_SIZE, 311,
												Short.MAX_VALUE).addGap(85))
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addContainerGap(
																				10,
																				Short.MAX_VALUE)
																		.addComponent(
																				campopalabra,
																				GroupLayout.PREFERRED_SIZE,
																				182,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addComponent(
																				CampopalabraTraduccion,
																				182,
																				182,
																				182))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(79)
																		.addComponent(
																				lblPalabra,
																				GroupLayout.PREFERRED_SIZE,
																				52,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				131,
																				Short.MAX_VALUE)
																		.addComponent(
																				lblTraduccion,
																				GroupLayout.PREFERRED_SIZE,
																				80,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(50)))
										.addGap(14))
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap(276, Short.MAX_VALUE)
										.addComponent(comboBoxIdioma,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(37))
						.addGroup(
								Alignment.LEADING,
								groupLayout.createSequentialGroup().addGap(142)
										.addComponent(botonañadirpalabras)
										.addContainerGap(151, Short.MAX_VALUE)));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(27)
										.addComponent(lblañadirpalabra,
												GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE)
										.addGap(52)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblTraduccion,
																GroupLayout.PREFERRED_SIZE,
																14,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblPalabra,
																GroupLayout.PREFERRED_SIZE,
																14,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																campopalabra,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																CampopalabraTraduccion,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(30)
										.addComponent(comboBoxIdioma,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED,
												127, Short.MAX_VALUE)
										.addComponent(botonañadirpalabras)
										.addContainerGap()));
		getContentPane().setLayout(groupLayout);

	}

	public void cambiarIdioma(String nombreIdioma) {

		try {

			Properties propiedades = new Properties();

			if (nombreIdioma.equals("Español")) {
				opc = 1;
				propiedades
						.load(new FileInputStream(
								"C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/espanol.properties"));

			}
			if (nombreIdioma.equals("Ingles")) {
				opc = 2;
				propiedades
						.load(new FileInputStream(
								"C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/ingles.properties"));

			}
			if (nombreIdioma.equals("Tibetano")) {
				opc = 3;
				propiedades
						.load(new FileInputStream(
								"C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/tibetano.properties"));

			} else if (nombreIdioma.equals("Frances")) {
				opc = 4;
				propiedades
						.load(new FileInputStream(
								"C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/frances.properties"));

			}

			this.setTitle(propiedades.getProperty("titulo"));
			lblañadirpalabra.setText(propiedades.getProperty("label"));
			lblPalabra.setText(propiedades.getProperty("palabra"));
			lblTraduccion.setText(propiedades.getProperty("traduccion"));
			botonañadirpalabras.setText(propiedades.getProperty("añadir"));

			comboBoxIdioma.removeAllItems();

			String idiomas[] = { propiedades.getProperty("seleccion"),
					propiedades.getProperty("es"),
					propiedades.getProperty("in"),
					propiedades.getProperty("ti"),
					propiedades.getProperty("fran")

			};

			for (int i = 0; i < idiomas.length; i++) {
				comboBoxIdioma.addItem(idiomas[i]);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error, El archivo no exite");
		} catch (IOException e) {
			System.out.println("Error, No se puede leer el archivo");
		}

	}
}
