package beans;

public class Cancion {

	private int idCancion;
	private String nombre;
	private String autor;
	private String tipo;
	private int duracion;
	
	public Cancion() {}
	public Cancion(int idCancion, String nombre, String autor, String tipo, int duracion) {
		this.idCancion = idCancion;
		this.nombre = nombre;
		this.autor = autor;
		this.tipo = tipo;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getIdCancion() {
		return idCancion;
	}
}


