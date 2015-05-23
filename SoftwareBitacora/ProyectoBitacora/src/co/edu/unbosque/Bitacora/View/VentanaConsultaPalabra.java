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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class VentanaConsultaPalabra extends JInternalFrame {
	private JTable tablaconsultapalabras;
	private JLabel lblListaPalabras;

	public VentanaConsultaPalabra() {
		setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		setTitle("lista");
		setClosable(true);
		setFrameIcon(new ImageIcon(VentanaConsultaPalabra.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setResizable(true);
		setIconifiable(true);
		setBounds(100, 100, 585, 377);
		getContentPane().setLayout(null);
		
		lblListaPalabras = new JLabel("lbl");
		lblListaPalabras.setFont(new Font("Arial Unicode MS", Font.BOLD, 13));
		lblListaPalabras.setBounds(10, 11, 559, 15);
		getContentPane().add(lblListaPalabras);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 37, 569, 310);
		getContentPane().add(scrollPane);
		
		tablaconsultapalabras = new JTable();
		tablaconsultapalabras.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		tablaconsultapalabras.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		tablaconsultapalabras.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Espa\u00F1ol", "English", "Fran\u00E7ais", "\u0F56\u0F7C\u0F51\u0F0B\u0F66\u0F90\u0F51 "
			}
		));
		scrollPane.setViewportView(tablaconsultapalabras);

	}
	public void cambiarIdiomaConsulta(String nombreIdioma){
        
		  try {
		 
		  Properties propiedades = new Properties();
		  
		  if(nombreIdioma.equals("Español")){
			  
			  propiedades
			     .load(new FileInputStream(
			       "C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/espanol.properties"));
			  
		  }
		  if (nombreIdioma.equals("Ingles")){
			  propiedades
			     .load(new FileInputStream(
			       "C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/ingles.properties"));
		  }
		  if (nombreIdioma.equals("Tibetano")){
			  propiedades
			     .load(new FileInputStream(
			       "C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/tibetano.properties"));
		  }else if(nombreIdioma.equals("Frances")){
			  propiedades
			     .load(new FileInputStream(
			       "C:/Users/Sergio/Proyectos Eclipse/ProyectoBitacora/src/PropiedadesIdioma/frances.properties"));
		  }
		 
	        this.setTitle(propiedades.getProperty("tituloconsul"));
	        lblListaPalabras.setText(propiedades.getProperty("labelconsul"));
	        		    
		  } catch (FileNotFoundException e) {
		   System.out.println("Error, El archivo no exite");
		  } catch (IOException e) {
		   System.out.println("Error, No se puede leer el archivo");
		  }
		 
}
}
