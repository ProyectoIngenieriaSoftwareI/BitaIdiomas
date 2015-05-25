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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;
import javax.swing.JButton;

import co.edu.unbosque.Bitacora.Controller.CoordinadorController;
import co.edu.unbosque.Bitacora.Model.ModelEstudiante;
import co.edu.unbosque.Bitacora.Model.ModelLogin;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaConsultaPalabra extends JInternalFrame {
	private JTable tablaconsultapalabras;
	private JLabel lblListaPalabras;
	private JButton btnElim;
	private JLabel lbleliminar;
	private CoordinadorController coordinador;
	private ModelLogin log;
	private JTextField campoelipalabra;

	public VentanaConsultaPalabra() {
		initcomponents();
	}
	public void initcomponents(){
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
		scrollPane.setBounds(0, 103, 569, 244);
		getContentPane().add(scrollPane);
		
		tablaconsultapalabras = new JTable();
		tablaconsultapalabras.setBorder(null);
		tablaconsultapalabras.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		tablaconsultapalabras.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"#", "Espa\u00F1ol", "English", "Fran\u00E7ais", "bod skad"
			}
		));
		scrollPane.setViewportView(tablaconsultapalabras);
		
		lbleliminar = new JLabel("eli");
		lbleliminar.setFont(new Font("Arial Unicode MS", Font.BOLD, 13));
		lbleliminar.setBounds(92, 37, 161, 15);
		getContentPane().add(lbleliminar);
		
		campoelipalabra = new JTextField();
		campoelipalabra.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		campoelipalabra.setBounds(263, 37, 200, 20);
		getContentPane().add(campoelipalabra);
		campoelipalabra.setColumns(10);
		
		btnElim = new JButton("elim");
		btnElim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ModelEstudiante estu = new ModelEstudiante();
				String idpal= campoelipalabra.getText();
				System.out.println("id "+idpal);
				estu.eliminarPalabra(idpal);
		}
		});
		btnElim.setFont(new Font("Arial Unicode MS", Font.BOLD, 12));
		btnElim.setBounds(315, 68, 102, 23);
		getContentPane().add(btnElim);

	}
	public void setCoordinador(CoordinadorController coordinador) {
		this.coordinador=coordinador;
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
	        lbleliminar.setText(propiedades.getProperty("labeleliminar"));
	        btnElim.setText(propiedades.getProperty("botoneliminar"));
	        
	        		    
		  } catch (FileNotFoundException e) {
		   System.out.println("Error, El archivo no exite");
		  } catch (IOException e) {
		   System.out.println("Error, No se puede leer el archivo");
		  } 
}
	public void LLenartabla(){
        ArrayList<ArrayList> e = new ArrayList<ArrayList>();
        try {
        	ModelEstudiante estu = new ModelEstudiante();
            e = estu.getPalabras(log.id);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaConsultaPalabra.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaconsultapalabras.setModel(new javax.swing.table.DefaultTableModel(
                new Object[e.size()][5],
                new String[]{
                		"#","Espa\u00F1ol", "English", "Fran\u00E7ais", "bod skad"
                		}));

        /// Pendiente definir for para cargar registros de cada usuario
        for (int i = 0; i < e.size(); i++) {
            for (int j = 0; j < e.get(i).size(); j++) {
                System.out.println("ij: "+e.get(i).get(j)+"j: "+i+"i: "+j);
            	tablaconsultapalabras.setValueAt(e.get(i).get(j), i, j);
            }

        }

	}
}
