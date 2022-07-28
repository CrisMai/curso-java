package br.com.cris.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import static junit.framework.Assert.*;
import junit.framework.Assert;

import br.com.cris.heranca.Cubo;

class CuboTest {
	
	Cubo cubo;

	@BeforeEach
	public void setUp() throws Exception {
		cubo = new Cubo(10);
	}

	@Test
	public void testCalculaVolume() {
		assertEquals(600, cubo.calculaVolume(), 0);
	}

	@Test
	public void testCalculaArea() {
		assertEquals(1000, cubo.calculaArea(), 0);
	}

}
