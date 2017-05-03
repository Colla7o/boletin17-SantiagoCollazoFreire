package boletin17Junit;

import java.util.Scanner;

public class Xeometria {
	public static void main(String[] ar) {
		int perimetroCadrado, areaCadrado;
		double teoremaPitagoras;
		Scanner teclado;

		teclado = new Scanner(System.in);
		System.out.print("\nDame perimetroCadrado:");
		perimetroCadrado = teclado.nextInt();
		System.out.print("Dame areaCadrado:");
		areaCadrado = teclado.nextInt();
		System.out.print("teoremapitagoras:");
		System.out.println((perimetroCadrado * perimetroCadrado) + (areaCadrado * areaCadrado));
		teclado.close();

	}

}
