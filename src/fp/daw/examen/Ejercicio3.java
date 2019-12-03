package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de
	 * dos o más números enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3),
	 * 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e
	 * indique si éste es guay.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean test=true;
		System.out.print("Introduce un número entero");
		
		int num = in.nextInt();

		for (int i = 1; i <= num; i++) {
			test = false;
			for (int j = 2; j < ((i / 2) + 1); j++) {
				if (i % j == 0) {
					test = true;
				}
			}
			}if (test) {
				System.out.print(" Es perfecto");
		}
	}
}

