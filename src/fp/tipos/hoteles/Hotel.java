package fp.tipos.hoteles;

import fp.common.Coordenada;
import fp.utiles.Checkers;
public record Hotel(String nombre, String direccion, String ciudad, String telefono, String cadenaHotelera, String descripcion,
		CategoriaHotelera categoriaHotelera, TipoAlojamiento tipoAlojamiento, CategoriaPrecio categoriaPrecio, 
		Float puntuacion, Integer numeroComentarios, Boolean admiteMascotas, Boolean estaAdaptado, 
		Coordenada coordenada) {
	public Hotel{
		Checkers.check("Puntuación erronea"+ puntuacion, puntuacion == null || puntuacion>=0);
		Checkers.check("Num comentarios erroneo"+ numeroComentarios, numeroComentarios ==null || numeroComentarios >=0);
	}
	public Hotel(String nombre, String direccion, String ciudad,String telefono,
			String cadenaHotelera, CategoriaHotelera categoriaHotelera) {
		this(nombre,direccion,ciudad,telefono,cadenaHotelera,null,categoriaHotelera,
				TipoAlojamiento.HOTEL, CategoriaPrecio.MEDIA,null,0,false,false,null);
		
	}
	
	public Hotel(String nombre, String cadenaHotelera, CategoriaHotelera categoria) {
		this(nombre,null,null,null,cadenaHotelera,categoria);
		
	}
   

}
