package Testes;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Atividades.Palindromos;

public class PalindromosTest {

	
// teste negativo
	@Test
	public void testIsPalindromo() {
		
		String a = "Ana";
		int s=0;
		boolean resultado =Palindromos.isPalindromo(a, s);
		
		
		
		
		assertEquals(true, resultado);
		

	}
// teste positivo
	@Test
	public void testIsPalindromo1() {
		String a1= "ana";
		int s1= 0;
		boolean resultado1 =Palindromos.isPalindromo(a1, s1);
		
		
		assertEquals(true, resultado1);
	}
	
	
	}
