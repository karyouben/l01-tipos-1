package fp.common.test;

import fp.common.Coordenada;


public class TestCoordenada {

	public static void main(String[] args) {
		Coordenada c1 = new Coordenada(1.4,40.23);
		System.out.println(c1);
		Coordenada c2 = new Coordenada(1.4,-40.23);
		testConstructorCanonico(1.4,40.23);
		testConstructorCanonico(1.4,-40.23);
		testConstructorCanonico(-100.0,-40.23);
		testConstructorCanonico(90.0,190.0);
		System.out.println(c2);
		System.out.println(c1.getDistancia(c2));
		System.out.println(c1.getDistanciaHaversine(c2));
		
		

	}

	private static void testConstructorCanonico(Double latitud, Double longitud) {
		try {
		Coordenada c = new Coordenada(latitud,longitud);
		mostrarCoordenada(c);
		}catch(IllegalArgumentException e) {
			System.out.println("***IllegalaArgumentException capturada: " + e.getMessage());
		}catch(Exception e) {
			System.out.println("***Excepcion inesperada: " + e.getMessage());
		}
	}
	/**
	 * @param c Coordenada a mostrar
	 *Muestra por consola todas las propiedades(básicas y derivadas)
	 *del tipo.
	 */

	private static void mostrarCoordenada(Coordenada c) {
		System.out.println(c);
		System.out.println("latitud: "+ c.latitud());
		System.out.println("longitud: "+ c.longitud());
	}
	


}
