package Examen;

import java.util.Scanner;

public class Bucles {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Dime el numero limite: ");
		int numero = sc.nextInt();
		
		int contador = 0;
		while (contador <= numero) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("");
		
		System.out.print("Dime otro numero limite: ");
		int numero2 = sc.nextInt();
		
		int contador2 = 0;
		while (contador2 <= numero2) {
			System.out.println(contador2);
			contador2++;
			contador2++;
		}
		
	}

}

