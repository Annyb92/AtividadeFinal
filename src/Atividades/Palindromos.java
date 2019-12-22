package Atividades;

public class Palindromos {
	public static void main(String[] args) 
	{
	   
	    
	}
	
// Método para saber se é um palindromo.
	public static boolean  isPalindromo(String  a, int s)
	{
	    if(a.length() == s)
	        return true ;
	    if(a.charAt(s) == a.charAt(a.length() - ++s))
	        return  isPalindromo(a,s);
	    else return false ;
	}
}