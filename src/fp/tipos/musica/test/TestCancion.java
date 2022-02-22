package fp.tipos.musica.test;

import java.time.Duration;
import java.time.LocalDate;

import fp.tipos.musica.Cancion;
import fp.tipos.musica.Genero;

public class TestCancion {

	public static void main(String[] args) {
		
		Cancion c = new Cancion("Thriller", "M.Jackson");
		System.out.println(c);
		System.out.println(c.getFormatoCorto());
		c.setTitulo("Imagine");
		c.setArtista("J.Lennon");
		c.setDuracion(Duration.ofSeconds(80));
		c.setFechaLanzamiento(LocalDate.of(1970, 5, 2));
		c.setGenero(Genero.POP);
		System.out.println(c);
	}

}
