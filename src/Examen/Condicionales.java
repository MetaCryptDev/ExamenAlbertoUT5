package Examen;

import java.util.Scanner;

public class Condicionales {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Escribe un numero: ");
		int numero1 = sc.nextInt();

		if (numero1 % 2 == 0) {		
		System.out.println("El numero es par");
		}
		if (numero1 % 3 == 0) {		
			System.out.println("El numero es impar");
		}
		
		System.out.println("");
		
		System.out.print("Escribe un numero: ");
		int numero2 = sc.nextInt();

		if (numero2 == 0) {		
		System.out.println("El numero es 0");
		}
		if (numero2 > 0) {		
			System.out.println("El numero es positivo");
		}
		if (numero2 < 0) {		
			System.out.println("El numero es negativo");
		}
		
	}

}
