package co.edu.unbosque.Bitacora.View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;

public class VentanaQuiz extends JInternalFrame {

	public VentanaQuiz() {
		setFrameIcon(new ImageIcon(VentanaQuiz.class.getResource("/co/edu/unbosque/Bitacora/Resources/Universidad el bosque.jpg")));
		setMaximizable(true);
		setTitle("Quiz de Palabras");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 597, 347);

	}

}
