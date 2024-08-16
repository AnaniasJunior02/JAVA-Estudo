package Estudo.SintaxeJava.Aula2Operadores;

public class Operadores2_Aritimeticos {
	public static void main(String [] args) {
		/*Operadores Aritméticos*/
		double soma = 10.5 + 15.7;
		int subtracao = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15 / 3;
		int modulo = 18 % 3;// % representa o resto da divisão
		double resultado = (10 * 7) + (20 / 4);
		/*Fim Operações Aritiméticas*/
		
		/*EXEMPLOS*/
		
		/*o operador de soma + quando está junto com texto ele faz a conacatenação que funcionam da esquerda
		 * para a direita.
		 * ao colocar numeros junto de textos, será feita a soma até o momento em que o
		 * texto aparecer onde do cacactér em diante será feita a concatenação*/
		
		System.out.println(1 + 1 + 1 + "1" + 300); 
		
		/*o resultado foi 31300 onde ele somou os três primeiros
		e concatenou com os seguintes após aparecer um texto*/
		
		System.out.println("1" + 1 + 1 + 1);
		
		/*nesta situação o resultado será 13 por conta da ordem de procedência dos parenteses*/
	}
	
}
