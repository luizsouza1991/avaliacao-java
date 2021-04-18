package com.fatorial;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Fatorial fatorial = new Fatorial();
		
		Scanner d = new Scanner(System.in);
		System.out.println("Informe o número: ");
		int number = d.nextInt();
		
		System.out.println("Fatorial de " + number +": " + fatorial.calculaFatorial(number));
	}
	
	public int calculaFatorial(int number) {
		int fatorial = 1;
		for (int i = 1; i <= number; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

}
