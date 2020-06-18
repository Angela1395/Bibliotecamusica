package controlador;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import beans.Cancion;
import vista.Principal;

public class CentralCancion {
	
	public void saludar(String nombre) {

		/* Recoger Cancion */
		beans.Cancion CancionRecogido = new modelo.Cancion().recogerCancion(nombre);
		if(CancionRecogido != null) {			
			JOptionPane.showMessageDialog(null, "Hola "+CancionRecogido.getNombre());
			/* Llamada a la otra ventana */
			new vista.VistaCancion(CancionRecogido);
		}else {
			int opcion = JOptionPane.showConfirmDialog(null, "No se ha encontrado Cancion\n ¿Desea guardarlo?");
			if(opcion == 0) {
				/* Insertar Cancion */
				beans.Cancion nuevaCancion= new Cancion(0, nombre, "","",13);
				new modelo.Cancion().insertarCancion(nuevaCancion);
			}
			
		}
		
	}
	
	public void verTodos() {
		/* Cargar los datos */
		ArrayList<beans.Cancion> Cancion = new modelo.Cancion().recogerTodosCancion();
		/* Abrir ventana ver todos */
		new vista.Tabla(Cancion);
	}
	
}
