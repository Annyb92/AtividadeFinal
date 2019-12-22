package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Atividades.Ordenador;


public class OrdenadorTest {

	

	// Teste para o maior valor de uma lista;
	@Test
	public void testGetMaiorValor() {
		
		double Maior = 9.0;
		
		double resultado1= Ordenador.getMaiorValor(Maior);
		assertEquals(9.0,resultado1,9.0);
		
	}
	// Teste para o menor valor de uma lista;
	@Test
	public void testGetMenorValor() {
		double Menor=0.0;
		
		double resultado= Ordenador.getMaiorValor(Menor);
		assertEquals(0.0, resultado,0.0);
		
	}
	// teste da média de uma lista;
	@Test
	public void testGetValorMedio() {
		double Media=0.0;
		
		double resultado2= Ordenador.getMaiorValor(Media);
		assertEquals(5.742857142857143,resultado2,5.8);
		
	}
	// teste para saber a mediana de uma lista;
	@Test
	public void testGetMediana() {
		double mediana=8.0;
		
		double resultado4= Ordenador.getMediana(mediana);
		assertEquals(8.0,resultado4,8.0);
		
	}
	
	
}
