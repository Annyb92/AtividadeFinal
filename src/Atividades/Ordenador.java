package Atividades;
public class Ordenador {
	

	public static void main(String[] args) {
		double[] pColecao =  {2.5,6.7,8,8,9,0,6};
		double Menor = pColecao[0];
		double Maior = pColecao[0];
		double Media=0;
		int numElementos=pColecao.length;
		double mediana;
		// Calcular a mediana 
		if(pColecao.length % 2 == 0){
            int sumaMedios = (int) (pColecao[numElementos/2] + pColecao[numElementos/2 - 1]); 
            mediana = (double)sumaMedios / 2; 
        } else {
            mediana = pColecao[numElementos/2];
        }
        
		
		
		
		// Percorrer a lista para pegar o maior valor, menor valor, média e mediana (?)
		for(int i = 0; i < pColecao.length; i++){
		    if ( pColecao[i] < Menor ){
		    	Menor = pColecao[i];
		    }
		    if( pColecao[i] > Maior ) {
		    	Maior = pColecao[i];
		    }
		    Media += pColecao[i];
		}
			Media = Media / pColecao.length;
			
			System.out.println("O maior nº digitado foi " +Maior);
			System.out.println("O menor nº digitado foi " +Menor);
			System.out.println("A média foi " +Media);
			System.out.println("A mediana foi " +mediana);
	}
		
	
	//mediana
	public static double getMediana(double mediana) {
		return mediana;
		
	}
	// Maior
	public static double getMaiorValor(double Maior) {
		return Maior;
		
	}
	// Menor
	public static double getMenorValor(double Menor) {
		
		return Menor;
	}
	// Média
	public static double getValorMedio(double Media) {
		return Media;
	}
	

	}