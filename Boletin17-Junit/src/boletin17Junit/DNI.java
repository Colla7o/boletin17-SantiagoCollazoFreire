package boletin17Junit;

public class DNI {
	char calculaLetra(int dni) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo = dni % 23;
		char letra = juegoCaracteres.charAt(modulo);
		return letra;
	}
}