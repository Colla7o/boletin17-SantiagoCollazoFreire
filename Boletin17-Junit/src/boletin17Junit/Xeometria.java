package boletin17Junit;

import java.lang.Math;

public class Xeometria {
	/**
	 * Recibe valor para cada un dos lados e retorna o valor do perimetro total
	 * 
	 * @param lado
	 * @return perimetro
	 */

	int perimetroCadrado(int lado) {
		int perimetro;

		perimetro = (lado * 4);

		return perimetro;
	}
/**
 * Recibe o valor para cada un dos lados, e retorna a area total do cadrado
 * @param lado
 * @return area
 */
	int areaCadrado(int lado) {
		int area;

		area = (lado * lado);

		return area;
	}
	/**
	 * Recibe o valor de cada un dos catetos para calcular mediante a raíz cadrada a hipotenusa
	 * @param catetoA
	 * @param catetoB
	 * @return hipotenusa
	 */

	double teoremaPitagoras(int catetoA, int catetoB) {

		double hipotenusa;

		hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));

		return hipotenusa;

	}
	/**
	 * Recibe o valor da hipotenusa e dun cateto, para calcular o outro cateto.
	 * @param hipotenusa
	 * @param catetoA
	 * @return catetoB
	 */

	double teoremaPitagoras1(double hipotenusa, double catetoA) {

		double catetoB;

		catetoB = Math.sqrt((catetoA * catetoA) - (hipotenusa * hipotenusa));

		return catetoB;
	}

}