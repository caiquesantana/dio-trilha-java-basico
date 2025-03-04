package br.com.dio.operadores;

public class Operadores {

	public static void main(String[] args) {
		int numero = 5;
		
		// o ++ e um operador de incremento
		numero++; 
		System.out.println(numero);
		
		numero--;
		System.out.println(numero);
		
		//Inverter um valor booleano é utilizado o ponto de exclamação !
		
		boolean variavel = true;
		System.out.println(variavel);
		
		variavel = !variavel;
		System.out.println(variavel);
		
		
		// Operador ternario "?" caso condicao seja true e ":" Caso condição seja false 
		
		int a, b;
		
		a = 5;
		b = 6;
		
		String resultado = a==b ? "Verdadeiro" : "Falso";
		System.out.println(resultado);
		
		// quando é usado um objeto ou texto, o mais recomendado para comparação é o "equals"
		String nomeUm = "Caique";
		String nomeDois = new String ("Caique");
		System.out.println(nomeUm.equals(nomeDois));
		
		
		
		
		
	}

}
