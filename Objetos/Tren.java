package Objetos;

public class Tren {

	
//-----------CARACTERÍSTICAS-----------//
	
	//datos que van a tener todos los trenes
	
	int vagones[][] = new int[5][2];		//matriz con número de asientos y número de pasajeros 
	String maquinista;
	int antiguedad;
	
	
//-----------CONSTRUCTOR--------------//	
	
	//la funcion constructora da valores a esos datos
	
	public Tren() {
		for (int i=0; i<=4; i++) {
			vagones[i][0]=(i+1)*10;			//[i][0] son los asientos
			vagones[i][1]=0;				//[i][1] son los pasajeros
		}
		maquinista = "Anónimo";
		antiguedad = 0;
	}
	
	public Tren(String nombre, int anios) {
		for (int i=0; i<=4; i++) {
			vagones[i][0]=(i+1)*10;			//[i][0] son los asientos
			vagones[i][1]=0;				//[i][1] son los pasajeros
			
		}
		maquinista = nombre;
		antiguedad = anios;	
	}
	
	//Vamos a crear una función que llene nuestro tren
	
	public void CompletarVagon(int vagon) {			//void porque no retorna valor (por ejemplo, decir cuántos pasajeros)
		vagones[vagon][1]=vagones[vagon][0];
		System.out.println("El vagón "+(vagon+1)+" se ha completado");
		
	}
	
	public void MeterPasajero(int vagon, int pasajeros) {
		if((vagones[vagon][1]+pasajeros)>vagones[vagon][0]) {
			System.out.println("No hay tantos asientos libres en el vagón "+(vagon+1)+".");
		}else {
			vagones[vagon][1]=vagones[vagon][1]+pasajeros;
			System.out.println("Se han añadido "+pasajeros+ " pasajeros.");
		}
	}
	
}
