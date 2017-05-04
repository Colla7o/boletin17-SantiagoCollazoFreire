package boletin17Junit;

import java.util.Scanner;

public class DNI {

	public static void main(String[] args) {

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println("Introduce DNI sin letra: ");
		Scanner leer = new Scanner(System.in);
		int dni = Integer.parseInt(leer.next());
		int calculaletra = dni - (Math.abs(dni / 23) * 23);
		System.out.println("Su letra de DNI es: " + letras.charAt(calculaletra));
	}

}
