package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Cancion;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaCancion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VistaCancion(Cancion Cancion) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel(Cancion.getNombre());
		lblNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Hola "+Cancion.getNombre());
			}
		});
		lblNombre.setBounds(168, 49, 142, 14);
		panel.add(lblNombre);
		
		JLabel lblAutor = new JLabel("El autor es: " + Cancion.getAutor());
		lblAutor.setBounds(62, 131, 248, 14);
		panel.add(lblAutor);
		
		setVisible(true);
	}
}