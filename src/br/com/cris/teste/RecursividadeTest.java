package br.com.cris.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;
//import static junit.framework.Assert.*;

import br.com.cris.refinado.Recursividade;

class RecursividadeTest {

	@BeforeEach
	public void setUp() throws Exception {
	}

	@Test
	public void testSoma() {
		assertEquals(55, Recursividade.soma(10));
	}

	@Test
	public void testPotencia() {
		assertEquals(81, Recursividade.potencia(3, 4));		
	}

}
