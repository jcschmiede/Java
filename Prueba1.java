import java.util.Scanner;

public class Prueba1 {
	public static void main(String[] args) {

		int n1=0;
		int n2=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		n1=sc.nextInt();
		System.out.println("Introduzca otro número: ");
		n2=sc.nextInt();
		
		System.out.println("El producto de ambos números es: "+(n1*n2));
		
			
		sc.close(); 
		
		
	}
}
