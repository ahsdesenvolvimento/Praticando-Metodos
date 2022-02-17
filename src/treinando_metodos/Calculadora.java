// André Henrique Sousa
package treinando_metodos;

public class Calculadora {

	public static void soma(double numero1,double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("O resultado da soma de "+numero1+" com " +
		numero2 + " é igual a: "+ resultado);
	}
	public static void subtracao(double numero1,double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("O resultado da subtracao de "+numero1+" e " +
		numero2 + " é igual a: "+ resultado);
	}
	public static void divisao(double numero1,double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("O resultado da divisao de "+numero1+" por " +
		numero2 + " é igual a: "+ resultado);
	}
	public static void multiplicacao(double numero1,double numero2) {
		double resultado = numero1 * numero2;
		System.out.println("O resultado da multiplicacao de "+numero1+" por " +
		numero2 + " é igual a: "+ resultado);
	}
}
