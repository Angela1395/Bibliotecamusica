package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;

public class Cancion {
	
	public void insertarCancion(beans.Cancion Cancion) {
		String nombre = Cancion.getNombre();
		String autor = Cancion.getAutor();
		String tipo = Cancion.getTipo();
		int duracion = Cancion.getDuracion();

		conexion.EjecutarUpdate("INSERT INTO cancion (nombre,autor,tipo,duracion) VALUES ('"+nombre+"','"+autor+"','"+tipo+"','"+duracion+"');");
	}
	
	public beans.Cancion recogerCancion(String idCancion) {
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM cancion WHERE nombre='"+idCancion+"';");
		try {
			if(resultado.next()) {
				int idCancion1 = resultado.getInt("idCancion");
				String nombre = resultado.getString("nombre");
				String autor = resultado.getString("autor");
				String tipo = resultado.getString("tipo");
				int duracion = resultado.getInt("duracion");
				beans.Cancion CancionRecogido = new beans.Cancion(idCancion1, nombre, autor,tipo, duracion );
				return CancionRecogido;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/* Transformacion */
		return null;
	}
	
	public ArrayList<beans.Cancion> recogerTodosCancion(){
		ArrayList<beans.Cancion> Cancion = new ArrayList<beans.Cancion>();
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM alumnos;");
		try {
				while(resultado.next()) {
					int idCancion = resultado.getInt("idCancion");
					String nombre = resultado.getString("nombre");
					String autor = resultado.getString("autor");
					String tipo = resultado.getString("tipo");
					int duracion = resultado.getInt("duracion");
					Cancion.add  (new beans.Cancion(idCancion, nombre, autor,tipo,duracion));
			}
				}catch (SQLException e) {
			e.printStackTrace();
		}
			return Cancion;
	}
}
