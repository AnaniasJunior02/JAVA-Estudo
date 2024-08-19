package Estudo.SintaxeJava.Aula2Operadores;

public class Operadores4_Incrementacao_Decrementacao {
	public static void main(String [] args) {
		/*a incrementação e decrementação são muito usadas em repetições*/
		
		int numero = 5;
		++numero; //é o mensmo que colocar numero = numero++ ou numero = numero + 1
		System.out.println(numero); //6
		
		System.out.println(numero ++); // o valor continuara 6 pois o número não será atualizado
		System.out.println(numero); //7
		
		//é possível faze-lo imprimir o valor atualizado ao colocar o operador antes do valor
		
		System.out.println(++ numero); //8
		
		//A decrementação funciona igual
		System.out.println(-- numero); //7
	}
}
