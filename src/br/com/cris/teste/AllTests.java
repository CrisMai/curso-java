package br.com.cris.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cris.refinado.Recursividade;

@RunWith(Suite.class)
@SuiteClasses({CuboTest.class, MatematicaTest.class, RecursividadeTest.class})
public class AllTests {

}
