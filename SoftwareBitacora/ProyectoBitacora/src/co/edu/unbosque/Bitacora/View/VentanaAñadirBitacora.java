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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaAñadirBitacora extends JInternalFrame {
	private JTextField CampopalabraTibetano;
	private JTextField campopalabraespañol;
	private JComboBox comboBoxIdiomaEspañol;

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
		setBounds(100, 100, 422, 348);
		
		JLabel labelañadirpalabra = new JLabel("A\u00F1adir palabra a Bitacora");
		labelañadirpalabra.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblPalabraEspaol = new JLabel("Palabra Espa\u00F1ol");
		lblPalabraEspaol.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblPalabraTibetano = new JLabel("Traducci\u00F3n");
		lblPalabraTibetano.setFont(new Font("Arial", Font.BOLD, 13));
		
		CampopalabraTibetano = new JTextField();
		CampopalabraTibetano.setColumns(10);
		
		campopalabraespañol = new JTextField();
		campopalabraespañol.setColumns(10);
		
		JButton botonañadirpalabras = new JButton("A\u00F1adir a Bitacora");
		botonañadirpalabras.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		comboBoxIdiomaEspañol = new JComboBox();
		comboBoxIdiomaEspañol.setToolTipText("Sellecci\u00F3n de Idioma a Traducir de la palabra.");
		comboBoxIdiomaEspañol.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un Idioma:", "Ingl\u00E9s", "Tibetano", "Franc\u00E9s"}));
		comboBoxIdiomaEspañol.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(labelañadirpalabra, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
					.addGap(85))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(146)
					.addComponent(botonañadirpalabras)
					.addContainerGap(135, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(campopalabraespañol, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(CampopalabraTibetano, 182, 182, 182))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(lblPalabraEspaol)
							.addPreferredGap(ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
							.addComponent(lblPalabraTibetano, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(50)))
					.addGap(14))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(227, Short.MAX_VALUE)
					.addComponent(comboBoxIdiomaEspañol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(labelañadirpalabra, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPalabraTibetano, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPalabraEspaol, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(campopalabraespañol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(CampopalabraTibetano, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(comboBoxIdiomaEspañol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
					.addComponent(botonañadirpalabras)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

    }
}

