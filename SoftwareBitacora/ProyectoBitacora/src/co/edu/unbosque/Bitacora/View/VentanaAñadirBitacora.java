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

public class VentanaA�adirBitacora extends JInternalFrame {
	private JTextField CampopalabraTibetano;
	private JTextField campopalabraespa�ol;
	private JComboBox comboBoxIdiomaEspa�ol;

	public VentanaA�adirBitacora() {
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		initComponents();
	}
    private void initComponents(){
    	setFrameIcon(new ImageIcon(VentanaA�adirBitacora.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setTitle("Bitacora");
		setClosable(true);
		setBounds(100, 100, 422, 348);
		
		JLabel labela�adirpalabra = new JLabel("A\u00F1adir palabra a Bitacora");
		labela�adirpalabra.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblPalabraEspaol = new JLabel("Palabra Espa\u00F1ol");
		lblPalabraEspaol.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblPalabraTibetano = new JLabel("Traducci\u00F3n");
		lblPalabraTibetano.setFont(new Font("Arial", Font.BOLD, 13));
		
		CampopalabraTibetano = new JTextField();
		CampopalabraTibetano.setColumns(10);
		
		campopalabraespa�ol = new JTextField();
		campopalabraespa�ol.setColumns(10);
		
		JButton botona�adirpalabras = new JButton("A\u00F1adir a Bitacora");
		botona�adirpalabras.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		comboBoxIdiomaEspa�ol = new JComboBox();
		comboBoxIdiomaEspa�ol.setToolTipText("Sellecci\u00F3n de Idioma a Traducir de la palabra.");
		comboBoxIdiomaEspa�ol.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un Idioma:", "Ingl\u00E9s", "Tibetano", "Franc\u00E9s"}));
		comboBoxIdiomaEspa�ol.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(labela�adirpalabra, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
					.addGap(85))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(146)
					.addComponent(botona�adirpalabras)
					.addContainerGap(135, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(campopalabraespa�ol, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
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
					.addComponent(comboBoxIdiomaEspa�ol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(labela�adirpalabra, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPalabraTibetano, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPalabraEspaol, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(campopalabraespa�ol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(CampopalabraTibetano, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(comboBoxIdiomaEspa�ol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
					.addComponent(botona�adirpalabras)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

    }
}

