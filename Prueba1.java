import java.util.Scanner;

public class Prueba1 {
	public static void main(String[] args) {

		int n1=0;
		int n2=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero: ");
		n1=sc.nextInt();
		System.out.println("Introduzca otro n�mero: ");
		n2=sc.nextInt();
		
		System.out.println("El producto de ambos n�meros es: "+(n1*n2));
		
			
		sc.close(); 
		
		
	}
}
