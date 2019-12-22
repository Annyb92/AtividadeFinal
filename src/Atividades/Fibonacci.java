package Atividades;
public class Fibonacci {
	
  //Método 
    public static long NumeroFibonacci(int pPosicaoTermo) {
        if (pPosicaoTermo < 2) {
            return pPosicaoTermo;
        } else {
            return NumeroFibonacci(pPosicaoTermo - 1) + NumeroFibonacci(pPosicaoTermo - 2);
        }
     
    }
  
    public static void main(String[] args) {   
     
   
            
        }
    

    }
  
