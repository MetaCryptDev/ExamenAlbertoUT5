package Examen;
import java.util.*;

public class TratamientoCadenas {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Escribe la primera palabra: ");
		String palabra1 = sc.next();
		System.out.print("Escribe la segunda palabra: ");
		String palabra2 = sc.next();
		
		String combinadas= (palabra1 + " " + palabra2);		
		System.out.println("Tu String es: " + combinadas);
		System.out.println();
		
		System.out.println("Escribeme otra palabra");
		String palabra3 = sc.next().toLowerCase();
		int contador = 0;
		for(int i = 0; i < palabra3.length(); i++) {
		if(palabra3.substring(i).equals("a")) {
			contador++;
			}
		}
		System.out.println("Hay " + contador + " As dentro de la palabra " + palabra3);
	}
}
