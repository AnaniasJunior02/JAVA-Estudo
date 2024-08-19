package Estudo.SintaxeJava.Aula2Operadores;

public class Operadores7_Logicos {
	public static void main(String[] args) {
		/*Operadores Lógicos são recursos que permitem criar expressões lógicas maiores a partir da junção
		 * de duas ou mais expressões*/
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		/* o && significa E ou seja aqui estou conferindo se a condicao1 E condicao2 são verdadeiras.
		 *  Como sabemos somente uma é*/	
		if(condicao1 && condicao2) {		
			System.out.println("As duas expressões são verdadeiras");
		}
		System.out.println("Ambas não são verdadeiras");//como somente uma é verdadeira essa mensagem aparece
		
		/* || siginifica OU e abaixo estou conferindo se a condicao1 OU a condicao2 é verdadeira*/
		if(condicao1 || condicao2) {
			System.out.println("Uma das Condições é verdadeira");//como esperado essa mensagem aparece
		}
		
		/*é possível utilizar várias expressões em conjunto com várias condições*/
		if(condicao1 && (7 > 4) && (1 != 0)) {
			System.out.println("as condições são verdadeiras");
		}
	}
}
