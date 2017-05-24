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
		assertEquals(Xeometria.perimetroCadrado(),);
		assertEquals(Xeometria.perimetroCadrado(),)
	}

	@Test
	public void testareaCadrado() {
		assertEquals(Xeometria.areaCadrado(),);
		assertEquals(Xeometria.areaCadrado(),)
	}
	
	@Test
	public void testteoremaPitagoras() {
		assertEquals(Xeometria.teoremaPitagoras(),);
		assertEquals(Xeometria.teoremaPitagoras(),)
	}
	
	@Test
	public void testteoremaPitagoras1() {
		assertEquals(Xeometria.teoremaPitagoras1(),);
		assertEquals(Xeometria.teoremaPitagoras1(),)
	}
	
}
