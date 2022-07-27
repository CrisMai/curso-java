package br.com.cris.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cris.poo.Matematica;
import junit.framework.Assert;

import static junit.framework.Assert.*;

class MatematicaTest {
	
	Matematica m;
	
	@BeforeEach
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@Test
	public void testMaior() {
		Assert.assertEquals(20, m.maior(10, 20));
	}

}

/* Teste Unitário
 
 Biblioteca JUnit
 
 */


