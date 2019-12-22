package Testes;


import static org.junit.Assert.*;


import org.junit.Test;

import Atividades.Anagrama;

public class AnagramaTest {
	
	

// resultado negativo
	@Test
	public void testIsAnagram() {
		
		String s11="loja";
		String s21= "casa";
		boolean resultado1= Anagrama.isAnagram(s11, s21);
		assertEquals(true,resultado1);
		
		
		

		
		
	
	}
	
	// resultado positivo
	public void testIsAnagram1() {
		String s1="roma";
		String s2= "amor";
		
		
		boolean resultado= Anagrama.isAnagram(s1, s2);
		assertEquals(true,resultado);

		
		
	
	}
	
	

}
