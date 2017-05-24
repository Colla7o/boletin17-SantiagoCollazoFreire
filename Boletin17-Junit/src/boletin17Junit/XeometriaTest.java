package boletin17Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XeometriaTest {
	
	Xeometria Xeometria = new Xeometria();

	@Test
	public void testperimetroCadrado() {
		assertEquals(Xeometria.perimetroCadrado(2),8);
		assertEquals(Xeometria.perimetroCadrado(45),180);
	}

	@Test
	public void testareaCadrado() {
		assertEquals(Xeometria.areaCadrado(2),4);
		assertEquals(Xeometria.areaCadrado(-1),-1);
	}
	
	@Test
	public void testteoremaPitagoras() {
		equals(Xeometria.teoremaPitagoras1(1,2));
		equals(Xeometria.teoremaPitagoras1(-1,2));
		equals(Xeometria.teoremaPitagoras1(1,-2));
		equals(Xeometria.teoremaPitagoras1(0,2));
		equals(Xeometria.teoremaPitagoras1(1,0));
		equals(Xeometria.teoremaPitagoras1(-1,0));
		equals(Xeometria.teoremaPitagoras1(-1,-2));
	}
	
	@Test
	public void testteoremaPitagoras1() {
		equals(Xeometria.teoremaPitagoras1(1,2));
		equals(Xeometria.teoremaPitagoras1(-1,2));
		equals(Xeometria.teoremaPitagoras1(1,-2));
		equals(Xeometria.teoremaPitagoras1(0,2));
		equals(Xeometria.teoremaPitagoras1(1,0));
		equals(Xeometria.teoremaPitagoras1(-1,0));
		equals(Xeometria.teoremaPitagoras1(-1,-2));
	}
	
}
