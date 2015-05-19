package co.edu.unbosque.Bitacora.View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.beans.PropertyVetoException;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

public class VentanaAñadirBitacora extends JInternalFrame {
	private JTextField CampopalabraTibetano;
	private JTextField campopalabraespañol;
	private JTextField campopalabraingles;
	private JTextField campopalabrafrances;

	public VentanaAñadirBitacora() {
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		initComponents();
	}
    private void initComponents(){
    	setFrameIcon(new ImageIcon(VentanaAñadirBitacora.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setTitle("Bitacora");
		setClosable(true);
		setBounds(100, 100, 724, 293);
		
		JLabel labelañadirpalabra = new JLabel("A\u00F1adir palabra a Bitacora");
		labelañadirpalabra.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblPalabraEspaol = new JLabel("Palabra Espa\u00F1ol");
		lblPalabraEspaol.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		JLabel lblPalabraIngls = new JLabel("Traducci\u00F3n Ingl\u00E9s");
		lblPalabraIngls.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		JLabel lblPalabraFrancs = new JLabel("Traducci\u00F3n Franc\u00E9s");
		lblPalabraFrancs.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		JLabel lblPalabraTibetano = new JLabel("Traducci\u00F3n Tibetano");
		lblPalabraTibetano.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		CampopalabraTibetano = new JTextField();
		CampopalabraTibetano.setColumns(10);
		
		campopalabraespañol = new JTextField();
		campopalabraespañol.setColumns(10);
		
		campopalabraingles = new JTextField();
		campopalabraingles.setColumns(10);
		
		campopalabrafrances = new JTextField();
		campopalabrafrances.setColumns(10);
		
		JButton botonañadirpalabras = new JButton("A\u00F1adir a Bitacora");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(labelañadirpalabra, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(46)
							.addComponent(lblPalabraEspaol, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addGap(75)
							.addComponent(lblPalabraIngls, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(69)
							.addComponent(lblPalabraFrancs)
							.addGap(64)
							.addComponent(lblPalabraTibetano, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(campopalabraespañol, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(campopalabraingles, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(campopalabrafrances, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(CampopalabraTibetano, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(281)
							.addComponent(botonañadirpalabras)))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(labelañadirpalabra, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPalabraEspaol, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPalabraIngls, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPalabraFrancs, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPalabraTibetano, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(campopalabraespañol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(campopalabraingles, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(campopalabrafrances, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(CampopalabraTibetano, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(57)
					.addComponent(botonañadirpalabras)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

    }
}

