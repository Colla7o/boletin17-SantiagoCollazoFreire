package boletin17Junit;

import java.lang.Math;

public class Xeometria {

	int perimetroCadrado(int lado) {
		int perimetro;

		perimetro = (lado * 4);

		return perimetro;
	}

	int areaCadrado(int lado) {
		int area;

		area = (lado * lado);

		return area;
	}

	double teoremaPitagoras(int catetoA, int catetoB) {

		double hipotenusa;

		hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));

		return hipotenusa;

	}

	double teoremaPitagoras1(double hipotenusa, double catetoA) {

		double catetoB;

		catetoB = Math.sqrt((catetoA * catetoA) - (hipotenusa * hipotenusa));

		return catetoB;
	}

}