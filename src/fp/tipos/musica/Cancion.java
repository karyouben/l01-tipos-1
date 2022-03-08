package fp.tipos.musica;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cancion implements Comparable<Cancion> {
	//Atributo (1 por cada propiedad básica)
	private String titulo;
	private String artista;
	private Duration duracion;
	private LocalDate fechaLanzamiento;
	private Genero genero;
	
	// Constructores
	// C1
	public Cancion(String titulo, String artista) {
		this.titulo = titulo;
		this.artista = artista ;
		duracion = Duration.ZERO;// DURATION.ofMinutes(0)
		fechaLanzamiento = null;
		genero = null;
		
	}
	public Cancion(String titulo, String artista, Duration duracion) {
//		if (duracion.compareTo(Duration.ZERO)<0) {
//			throw new IllegalArgumentException(
//					"Cancion.setDuracion: la duración debe ser mayor o igual que cero" + duracion);
//		}
		checkDuracion(duracion);
		List<Integer> l = new ArrayList<Integer>();
		Integer n = l.get(0);
		this.titulo = titulo;
		this.artista = artista ;
		this.duracion = duracion;// DURATION.ofMinutes(0)
		fechaLanzamiento = null;
		genero = null;
		
	}
	
	private void checkDuracion(Duration duracion) {
		if (duracion.compareTo(Duration.ZERO)<0) {
			throw new IllegalArgumentException(
					"Cancion.setDuracion: la duración debe ser mayor o igual que cero" + duracion);
		}
		
	}
	//Consultores
	public String getTitulo() {
		return titulo;
	}
	public String getArtista() {
		return artista;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public Genero getGenero() {
		return genero;
	}
	
	// Getter para propiedad derivada
	public String getFormatoCorto() {
		Long minutos = getDuracion().toMinutes(); //autoboxing
		Long segundos = getDuracion().getSeconds()%60;
		String res = this.getTitulo() + " (" +  getArtista() + ") " + 
		             minutos + ":" + segundos;
		return res;
	}
	
	//setters
	public void setTitulo(String nuevoTitulo) {
		titulo = nuevoTitulo;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setDuracion(Duration duracion) {
//		if (duracion.toSeconds()<0) {
//		throw new IllegalArgumentException("");
//	}
//	if (duracion.compareTo(Duration.ZERO)<0) {
//		throw new IllegalArgumentException("Cancion.setDuracion: la duración debe ser mayor o igual que cero" + duracion);
//	}
		checkDuracion(duracion);
		this.duracion = duracion;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Cancion [getTitulo()=" + getTitulo() + ", getArtista()=" + getArtista() + ", getDuracion()="
				+ getDuracion() + ", getFechaLanzamiento()=" + getFechaLanzamiento() + ", getGenero()=" + getGenero()
				+ ", getFormatoCorto()=" + getFormatoCorto() + "]";
	}
//	public String toString( ) {
//		return getTitulo() + "," + getArtista() + "," + getDuracion()+ "," +
//	    getFechaLanzamiento() + "," + getGenero() + "," + getFormatoCorto() ;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cancion))
			return false;
		Cancion other = (Cancion) obj;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	@Override
	public int compareTo(Cancion o) {
		int res = this.getArtista().compareTo(o.getArtista());
		if (res ==0) {
//			Integer lon = getTitulo().length();
//			Integer lonO = o.getTitulo().length();
//			res = lonO.compareTo(lon);
		res = this.getTitulo().compareTo(o.getTitulo());
		}
		return res;
	}
	
	

}
