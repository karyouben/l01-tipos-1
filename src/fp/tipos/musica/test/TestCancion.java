package fp.tipos.musica.test;

import java.time.Duration;
import java.time.LocalDate;

import fp.tipos.musica.Cancion;
import fp.tipos.musica.Genero;

public class TestCancion {

	public static void main(String[] args) {
		
		
		Cancion c = new Cancion("Thriller", "M.Jackson");
		Cancion c2 = new Cancion("black or white", "M.Jackson");
//		try {
		System.out.println(c2.compareTo(c));
		System.out.println(c);
		System.out.println(c.getFormatoCorto());
		c.setTitulo("Imagine");
		c.setArtista("J.Lennon");
		c.setDuracion(Duration.ofSeconds(80));
		c.setFechaLanzamiento(LocalDate.of(1970, 5, 2));
		c.setGenero(Genero.POP);
		System.out.println(c);
		
		testSetDuracion(c, Duration.ofSeconds(-80));
		testSetDuracion(c, Duration.ofSeconds(-10));
		testConstructor2("Hey Jude", "The Beatles", Duration.ofSeconds(-1));
		testConstructor2("Yellow Sumbmarine", "The Beatles", Duration.ofSeconds(0));
//		System.out.println("Probando con -80");
//		c.setDuracion(Duration.ofSeconds(-80));
//		System.out.println("Probando con -80");
//		c.setDuracion(Duration.ofSeconds(-10));
//		} catch (IllegalArgumentException e) {
//			System.out.println("Capturada expcepcion esperada " + e.getMessage());
//		}
		System.out.println(c);
	} 
	
	private static void testConstructor2(String titulo, String artista, Duration duracion) {
		try {
			Cancion c= new Cancion(titulo,artista,duracion);
			System.out.println("cancion creada"+ c);
		}catch (IllegalArgumentException e) {
			System.out.println("Capurada excepcion esperada " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Capurada excepcion esperada " + e.getMessage());
		}
	}

	private static void testSetDuracion(Cancion c, Duration d) {
		try {
			System.out.println("Probando con " + d );
			c.setDuracion(d);
//			c.setDuracion(Duration.ofSeconds(-80));
		}catch (IllegalArgumentException e) {
			System.out.println("Capurada excepcion esperada " + e.getMessage());
		}
	}

}
