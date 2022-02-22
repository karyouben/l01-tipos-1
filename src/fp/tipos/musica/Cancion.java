package fp.tipos.musica;

import java.time.Duration;
import java.time.LocalDate;

public class Cancion {
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
	
	

}
