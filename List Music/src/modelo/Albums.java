package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;

public class Albums {
	
	public void insertarAlbums(beans.Albums Albums) {
		String nombre = Albums.getNombre();
		String autor = Albums.getAutor();

		conexion.EjecutarUpdate("INSERT INTO Albums (nombre,autor) VALUES ('"+nombre+"','"+autor+"');");
	}
	
	public beans.Albums recogerAlbums(String nombreAlbums) {
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM alumnos WHERE nombre='"+nombreAlbums+"';");
		try {
			if(resultado.next()) {
				int idAlbums = resultado.getInt("idAlbums");
				String nombre = resultado.getString("nombre");
				String autor = resultado.getString("autor");
				beans.Albums AlbumsRecogido = new beans.Albums(idAlbums, nombre, autor);
				return AlbumsRecogido;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/* Transformacion */
		return null;
	}
	
	public ArrayList<beans.Albums> recogerTodosAlbums(){
		ArrayList<beans.Albums> Albums = new ArrayList<beans.Albums>();
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM albums;");
		try {
			while(resultado.next()) {
				int idAlbums = resultado.getInt("idAlbums");
				String nombre = resultado.getString("nombre");
				String autor = resultado.getString("autor");
				Albums.add  (new beans.Albums(idAlbums, nombre, autor));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Albums;
	}

}
