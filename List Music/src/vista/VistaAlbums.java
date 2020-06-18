package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Albums;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class VistaAlbums extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;

	public VistaAlbums(Albums Albums) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblCancion = new JLabel("Tabla Albums");
		lblCancion.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblCancion.setLabelFor(lblCancion);
		lblCancion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Hola "+Albums.getNombre());
			}
		});
		lblCancion.setBounds(207, 30, 142, 27);
		panel.add(lblCancion);
		
		JLabel lblAutor = new JLabel("El autor es:.....");
		lblAutor.setBounds(62, 131, 248, 14);
		panel.add(lblAutor);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre\r\n");
		txtNombre.setBounds(197, 128, 113, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		setVisible(true);
	}
}
