package br.com.dio.anatominaClasses;

public class MinhaClasse {
	public static void main (String[] args){
		
		/*Declarar uma variavel segue a seguite estruura: 
		TipoDaVariavel NomeBemDefinido = Atribuiçao (opcional em alguns casos)*/
		String primeiroNome = "Caique";
		String segundoNome = "Santana";
		int idade;
		double altura = 1.90;
		
		String nomeCompleto = nomeCompleto (primeiroNome,segundoNome );
		System.out.println(nomeCompleto);
				
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		
		return primeiroNome +" " + segundoNome;
	}
	
	

}
