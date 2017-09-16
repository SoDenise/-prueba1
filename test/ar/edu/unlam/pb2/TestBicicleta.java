package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBicicleta {

	@Test
	public void testQueCreaBiciUsandoConstructorVacio() {
		
		Bicicleta miBicicleta = new Bicicleta();
		Integer idActual = miBicicleta.getId();
		assertEquals(0.0,idActual,0.0);
		assertTrue(idActual==0);
		assertTrue(miBicicleta.getColor()=="blanca");
		
	}
	
	@Test
	public void testQueCreaBiciUsandoConstructorConParametros(){
		
		Bicicleta miBicicleta = new Bicicleta(5,20);
		Integer idActual = miBicicleta.getId();
		assertEquals(5,idActual,0);
		
		
	}

}
