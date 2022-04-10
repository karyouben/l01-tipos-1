package fp.tipos.musica;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import fp.utiles.Checkers;

public class Album {
	//Atributos
	private String nombre;
	private String id;
	private Integer popularidad;
	private Integer anyoPublicacion;
	private TipoAlbum tipo;
	private List<Cancion> canciones;
	private List<String> imagenes;
	// Constructores
	// C1
	public Album(String nombre, String id, Integer popularidad,
			Integer anyoPublicacion, TipoAlbum tipo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.popularidad = popularidad;
		this.anyoPublicacion = anyoPublicacion;
		this.tipo = tipo;
		canciones = new ArrayList<Cancion>();
		imagenes = new ArrayList<String>();
	}
	public Album() {
		Checkers.check("El id no tiene 22 caracteres " + id, id.length()==22);
		Checkers.check("La popularidad no esta comprendida entre los valores de 0-100 " + popularidad, popularidad>0 && popularidad<100);
	}
	public String getNombre() {
		return nombre;
	}
	public String getId() {
		return id;
	}
	public Integer getPopularidad() {
		return popularidad;
	}
	public Integer getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public TipoAlbum getTipo() {
		return tipo;
	}
	public List<Cancion> getCanciones() {
		return new ArrayList<Cancion>(canciones);
	}
	public List<String> getImagenes() {
		return new ArrayList<String>(imagenes);
	}
	@Override
	public String toString() {
		return "Album [nombre=" + nombre + ", id=" + id + ", popularidad=" + popularidad + ", anyoPublicacion="
				+ anyoPublicacion + ", tipo=" + tipo + ", num canciones=" + canciones.size() + ", num imagenes=" + imagenes.size() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Album))
			return false;
		Album other = (Album) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public void incorporaImagen(String imagen) {
		Checkers.check("Imagen no valida", imagen.startsWith("http"));
		imagenes.add(imagen);
	}

	

}
