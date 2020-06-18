package vista;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class Tabla extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public Tabla(ArrayList<beans.Cancion> Cancion) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/* Crear la tabla con su modelo */
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		contentPane.add(table, BorderLayout.CENTER);
		/* Crear las columnas */
		dtm.addColumn("ID");
		dtm.addColumn("Nombre");
		dtm.addColumn("Autor");
		dtm.addColumn("tipo");
		dtm.addColumn("Duracion");
		
		
		/* Rellenar los datos con el array de Cancion*/
		for(beans.Cancion Cancion1 : Cancion) {
			Object[] fila = new Object[5];
			fila[0] = Cancion1.getIdCancion();
			fila[1] = Cancion1.getNombre();
			fila[2] = Cancion1.getAutor();
			fila[3] = Cancion1.getTipo();
			fila[4] = Cancion1.getDuracion();
			dtm.addRow(fila);			
		}
		
		
		setVisible(true);
	}

}
