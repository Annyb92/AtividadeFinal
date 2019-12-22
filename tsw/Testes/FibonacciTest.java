package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Atividades.Fibonacci;

public class FibonacciTest {
// positivo: testando o valor na 5 posicao
	
	@Test
	public void testNumeroFibonacci() {
	int pPosicaoTermo= 4;
	long resultado=Fibonacci.NumeroFibonacci(pPosicaoTermo);
	assertEquals(3, resultado);

	
	}
	// Testando a falha
	@Test
	public void testNumeroFibonacci1() {
	int pPosicaoTermo1= 4;
	long resultado1=Fibonacci.NumeroFibonacci(pPosicaoTermo1);
	assertEquals(2, resultado1);

	
	}
	
	
	
	
	

}
