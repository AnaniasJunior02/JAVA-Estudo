package Estudo.SintaxeJava.Aula1TiposVariaveis;

public class TiposVariaveis {
	public static void main(String[] args) throws Exception{
		/*TIPOS PRIMITIVOS*/
		
		/*TIPOS PRIMITIVOS INTEIROS*/
		byte _byte = -128;
		_byte = 127;
		short _short = -32768;
		_short = 32767;
		int _int = -2147483648;
		_int = 2147483647;
		long _long = -9223372036854775808L;
		_long = 9223372036854775807L;
		/*FIM PRIMITIVOS INTEIROS*/
		
		/*PRIMITIVOS COM VÍRGULA*/
		float _float = -3.4028E+38F;
		_float = 3.4028E+38F;
		double _double = -1.7976E+308;
		_double = 1.7976E+308;
		/*FIM PRIMITIVOS COM VÍRGULA*/
		
		char _char = 0;
		_char = 65535;
		
		boolean _boolean = true;
		_boolean = false;
		
		/* FIM TIPOS PRIMITIVOS*/
		
		String _string = "textos";
		
		/*EXEMPLOS*/
		double salarioMinimo = 2500;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal; /*transformando um tipo de variável em outro*/
		/*caso queira definir que o tipo da variável não deve ser alterado é possivel utilizando o atributo
		 * final antes do tipo(equivalente ao const no javascript)*/
		double valor_de_pi = 3.14;
		valor_de_pi = 3;
		
		final int dezcm = 10;
		//dezcm = 20; nesta situação já não é possível alterar e será apontado um erro//
		/*FINAL EXEMPLOS*/
		
	}
}
