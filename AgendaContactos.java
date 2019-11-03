import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContactos {
		//made by JcSchmiede
	public static void main(String[] args) {

		
		ArrayList<String> agendaContactos = new ArrayList<String>();
		Scanner scOpcion = new Scanner(System.in);
		Scanner scNombre = new Scanner(System.in);
		Scanner scSeguro = new Scanner(System.in);
		int opcion=0;
		int posicion=0;
		int seguro=0;
		String nombre="";
		

		do {
			if(agendaContactos.size()!=0) {
				System.out.println("//////////////////////////////////////");
				System.out.println("/////// MI AGENDA DE CONTACTOS ///////");
				System.out.println("//////////////////////////////////////");
			
				for (String valor : agendaContactos) {
					System.out.println(valor);
				}
			}
			System.out.println("//////////////////////////////////////");
			System.out.println("////////////// OPCIONES //////////////");
			System.out.println("//////////////////////////////////////");
			System.out.println("1.- Añadir un contacto");
			System.out.println("2.- Modificar un contacto");
			System.out.println("3.- Eliminar un contacto");
			System.out.println("0.- Salir");
			System.out.println("\n");
			System.out.println("¿Qué desea hacer?");
			opcion= scOpcion.nextInt();
			
			if(opcion==1){
				System.out.println("Añadir un contacto.");
				System.out.println("Introduzca el nombre del contacto: ");
				nombre=scNombre.nextLine();
				agendaContactos.add(nombre);
			}else if(opcion==2) {
				System.out.println("Modificar un contacto");
				System.out.println("Elija el contacto que desea modificar: ");
				posicion=scOpcion.nextInt();
				System.out.println("Introduzca el nuevo nombre del contacto: ");
				nombre=scNombre.nextLine();
				
				agendaContactos.set(opcion, nombre);			
			}else if(opcion==3) {
				System.out.println("Eliminar un contacto");
				do {
					System.out.println("Elija el contacto que desea eliminar: ");
					posicion=scOpcion.nextInt();
					
					System.out.println("¿Está seguro de que quiere eliminar el contacto "+agendaContactos.get(posicion)+"?  0-sí/1-no");
					seguro=scSeguro.nextInt();
					if(seguro==0) {
						agendaContactos.remove(posicion);
					}
				}while(seguro!=0);
			}else if(opcion==0) {
				System.out.println("Salir");
			}else {
				System.out.println("No se reconoce la acción. Por favor, inténtelo de nuevo");
			}
			
		}while(opcion!=0);
		System.out.println("Ha salido del programa");
		
	}

}
