package Objetos;
import Objetos.Tren;

public class ObjetosTren {
	public static void main(String[] args) {
		
		Tren primero = new Tren("José", 25); 						
		/*
		System.out.println(primero.maquinista);
		System.out.println(primero.antiguedad);
		 */
		Tren segundo = new Tren();
		/*
		System.out.println(segundo.maquinista);
		System.out.println(segundo.antiguedad);
		*/
		
		primero.CompletarVagon(2);
		System.out.println(primero.vagones[2][1]);
		
		primero.MeterPasajero(2,2);
		primero.MeterPasajero(1, 5 );
	}
}
