package Estudo.SintaxeJava.Aula2Operadores;

public class Operadores5_Ternario {
	public static void main(String[] args) {
		/*O operador ternário é uma forma resumida para definir uma condição e escolher por um dentre dois valores
		 * como se fosse o IF normal com a estrutura em uma única linha.
		 * Ele é representado por :? desta forma: Expressão Condicional ? Caso ou condição seja true : Caso a condição seja false */
		
		/*Exemplo da estrutura com If e Else*/
		int a = 5, b= 6;
		String resultado = "";
		
		if(a == b)
			resultado = "verdadeiro";
			else
				resultado = "falso";
		
		System.out.println(resultado); //falso
		/*FIM Exemplo da estrutura com If e Else*/
		
		/*Exemplo operador ternário*/
		resultado = a == b ? "verdade" : "mentira";
		System.out.println(resultado);//mentira
		
		int resultadoNumerico = a == b ? 1 : 0; // o operador ternário não se limita a strings
		System.out.println(resultadoNumerico); //0
		
		
	}
}
