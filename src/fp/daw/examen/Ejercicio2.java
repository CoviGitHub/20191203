package fp.daw.examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números
	 * enteros y calcule la suma de todos los números impares comprendidos entre
	 * ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se
	 * introduzcan los dos números (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para
	 * obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2
	 * y 3.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int numA = 0;
		int numB = 0;

		System.out.println("Introduce un número entero");
		numA = Integer.parseInt(in.readLine());
		System.out.println("Introduce otro número entero");
		numB = Integer.parseInt(in.readLine());

		int digitos = (numA - numB) + 1;
		int sumaImp = 0;

		if (numA == numB && numA % 2 != 0) {
			System.out.print("La suma de los impares es " + numA);
		} else if (digitos > 0) {
			for (int i = 0; i < digitos; i++) {
				if (numB % 2 != 0) {
					sumaImp += numB;
				}
				numB++;
			}System.out.print("La suma de los impares es: " + sumaImp);

		} else {
			digitos = -((numA - numB) - 1);
			for (int j = 0; j < digitos; j++) {
				if (numA % 2 != 0) {
					sumaImp += numA;
				}
				numA++;
			}System.out.print("La suma de los impares es: " + sumaImp);
		}
		
	}
}
