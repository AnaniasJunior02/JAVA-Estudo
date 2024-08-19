package Estudo.SintaxeJava.Aula2Operadores;

public class Operadores6_Relacionais {
	public static void main(String[] args) {
		/*operadores relacionais possuem a proposta de avaliar relações e condições entre duas 
		 * variáveis e expressões. Definido se o operando a esquerda é menor, maior, igual, diferente
		 * ao da direita. Retornando um valor booleano como resultado*/
		
		/*Exemplos*/
		int numero1 = 1;
		int numero2 = 2;
		
		boolean SimNao = numero1 == numero2;		
		System.out.println("numero1 é igual a numero2? " + SimNao);//false
		
		SimNao = numero1 != numero2;	
		System.out.println("numero1 é diferente de numero2? " + SimNao);//true	
		
		 SimNao = numero1 > numero2;		
		System.out.println("numero1 é maior que numero2? " + SimNao);//false	
		
		SimNao = numero1 < numero2;		
		System.out.println("numero1 é menor que numero2? " + SimNao);//true
		
		SimNao = numero1 >= numero2;		
		System.out.println("numero1 é maior ou igual a numero2? " + SimNao);//false
		
		SimNao = numero1 <= numero2;		
		System.out.println("numero1 é menor ou igual a numero2? " + SimNao);//true
		
		/*operadores relacionais são usados principalmente em condições*/
		
		if(numero1 < numero2) {
			System.out.println("1 é menor que dois");//1 é menor que dois
			
		/*Os operadores relacionais não se limitam a números*/
		String nomeUm = "Alan";
		String nomeDois = "Alan";
		System.out.println(nomeUm == nomeDois);//true
		
		/*quando estamos usando objetos ou textos utilizamos o método equals*/
		nomeDois = new String("Alan");
		System.out.println(nomeUm == nomeDois);//false
		System.out.println(nomeUm.equals(nomeDois));//true
		}
	}
}
