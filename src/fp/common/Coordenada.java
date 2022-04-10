package fp.common;

import fp.utiles.Checkers;

public record Coordenada(Double latitud, Double longitud) {
	public Coordenada{
		Checkers.check("La latitud debe estar comprendida entre -90 y 90 "+ latitud, latitud>=-90 && latitud<=90);
		Checkers.check("La longitud debe estar comprendida entre -180 y 180 "+ longitud, longitud >=-180 && longitud <=180 );
	}
	
	private final static Double RADIO_TIERRA = 6371.0;
	public Double getDistancia(Coordenada c) {
		Double difLat = this.latitud() - c.latitud();
		Double difLon = longitud() - c.longitud();
		
		return Math.sqrt(Math.pow(difLat, 2)+ Math.pow(difLon, 2));
		
	}
	
	private Double latitudRadianes() {
		return Math.toRadians(latitud());
	}
	
	public Double getDistanciaHaversine(Coordenada c) {
		Double incrLat =  Math.toRadians (c.latitud()- latitud()) ;
		Double incrLon =  Math.toRadians (c.longitud()- longitud());
		// Double a = Math.sin(incrLat/2)*Math.sin(incrLat/2) + Math.cos(latitud()) * Math.cos(c.latitud()) * 
				// Math.sin(incrLon/2) * Math.sin(incrLon/2);
		Double a =Math.pow(Math.sin(incrLat/2), 2) + Math.cos(latitudRadianes()) * Math.cos(c.latitudRadianes()) * 
				Math.pow( Math.sin(incrLon/2), 2) ;
		Double calculoHaversine = 2* Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return RADIO_TIERRA * calculoHaversine;
		
	}

	

}
