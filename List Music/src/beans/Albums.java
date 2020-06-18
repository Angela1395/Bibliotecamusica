package beans;
public class Albums {

		private int idAlbums;
		private String nombre;
		private String autor;
		
		public Albums() {}
		public Albums(int idAlbums, String nombre, String autor) {
			this.idAlbums = idAlbums;
			this.nombre = nombre;
			this.autor = autor;
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
		public int getIdAlbums() {
			return idAlbums;
		}
		public Albums recogerAlbums(String nombre2) {
			// TODO Auto-generated method stub
			return null;
		}
		public void saludar(String nombre2) {
			// TODO Auto-generated method stub
			
		}
}

