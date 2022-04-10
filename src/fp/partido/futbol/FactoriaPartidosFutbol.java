package fp.partido.futbol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import fp.utiles.Checkers;

public class FactoriaPartidosFutbol {
	//metodo lector fichero
	//metodo parseo y construccion del objeto
	public static PartidoFutbol parsearPartido(String c) {
		Checkers.checkNoNull(c);
		String[] trozos = c.split(";");
		Checkers.check("Formato no valido " + c, trozos.length==5);
		LocalDate f =LocalDate.parse(trozos[0].trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalTime h = LocalTime.of(17, 0);
		LocalDateTime fecha =  LocalDateTime.of(f, h);
		String equipoLocal = trozos[1].trim();
		String equipoVisitante =trozos[2].trim();
		Integer golesLocal =Integer.parseInt(trozos[3].trim());
		Integer golesVisitante =Integer.parseInt(trozos[4].trim());
		return new PartidoFutol (fecha,equipoLocal,equipoVisitante,golesLocal,golesVisitante);
		
	}public static List<PartidoFutbol> leePartidos(String nombreFichero){
		List<PartidoFutbol> res = new ArrayList<PartidoFutbol>();
		return res;
	}

}
