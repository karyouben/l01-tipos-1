package fp.common.test;

import fp.common.Coordenada;

public class TestCoordenada {

	public static void main(String[] args) {
		Coordenada c1 = new Coordenada(1.4,40.23);
		System.out.println(c1);
		Coordenada c2 = new Coordenada(1.4,-40.23);
		System.out.println(c2);
		System.out.println(c1.getDistancia(c2));
		System.out.println(c1.getDistanciaHaversine(c2));
		
		

	}
	


}
