package controlador;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import beans.Albums;
import vista.Principal;

public class CentralAlbums {

	public void saludar(String nombre) {
		
		/* Recoger Albums */
		beans.Albums AlbumsRecogido = new modelo.Albums().recogerAlbums(nombre);
		if(AlbumsRecogido != null) {			
			JOptionPane.showMessageDialog(null, "Hola "+AlbumsRecogido.getNombre());
			/* Llamada a la otra ventana */
			new vista.VistaAlbums(AlbumsRecogido);
		}else {
			int opcion = JOptionPane.showConfirmDialog(null, "No se ha encontrado albums\n ¿Desea guardarlo?");
			if(opcion == 0) {
				Object beans;
				/* Insertar Albums */
				beans.Albums nuevoAlbums= new Albums(0, nombre, "");
				new modelo.Albums().insertarAlbums(nuevoAlbums);
			}
			
		}
		
	}
	
	public void verTodos() {
		/* Cargar los datos */
		ArrayList<Albums> Albums = new modelo.Albums().recogerTodosAlbums();
		
	}
	
}
