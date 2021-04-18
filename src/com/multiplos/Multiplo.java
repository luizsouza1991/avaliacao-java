package com.multiplos;
import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Multiplo multiplo = new Multiplo();
		
		System.out.println("Informe o número: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("Soma dos múltiplos de 3 e 5: " + multiplo.multiplos(number));
	}
	
	public int multiplos(int number) {
		int somaMultiplos = 0;
		for (int i = 0; i < number; i++) {
			if (i%3 == 0 || i%5 ==0) {
				somaMultiplos += i;
			}
		}
		return somaMultiplos;
	}
}
