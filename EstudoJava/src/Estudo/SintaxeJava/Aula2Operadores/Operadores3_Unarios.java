package Estudo.SintaxeJava.Aula2Operadores;

public class Operadores3_Unarios {
/*são operadores aplicados juntamente com outro operador aritimético, que realizam trabalhos basicos como
 * incrementar, decrementar e inverter valores numéricos e booleanos*/
	/*+ operador unário de valor positivo, os números são naturalmente positivos sem ele
	 * - operador unário de valor negativo
	 * ++ operador unário que incrementa valor em uma unidade
	 * -- operador unário que decrementa o valor em uma unidade
	 * ! operador lógico de negação que nega uma expressão booleana*/
	public static void main(String[] args) {
		int numero = 5; //já é naturalmente positivo
		numero = - numero; //transformando ele em negativo
		System.out.println(numero); //-5
		
		numero = + numero; // ao tentar converter ele para positivo assim não irá funcionar pois + é um operador de soma
		numero = numero * -1; // assim ele se tornará positivo
		System.out.println(numero); // 5
		
		numero = ++ numero; //incrementando o valor em 1
		System.out.println(numero); // 6
		
		numero = -- numero; // decrementando o valor em 1
		System.out.println(numero); // 5
		
		boolean verdade = true; //true atribuido a verdade
		verdade = ! verdade; //negando o valor da expressão
		System.out.println(verdade); // false
		
		//é possível usar o operador dentro da saída e inverter novamente o valor
		System.out.println(! verdade); //true
	}
	
}
