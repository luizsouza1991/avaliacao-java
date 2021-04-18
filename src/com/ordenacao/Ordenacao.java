package com.ordenacao;

public class Ordenacao {

	public static void main(String[] args) {
		Ordenacao order = new Ordenacao();
		int[] array = {5, 3, 2, 4, 7, 1, 0, 6};
		
		order.bubbleSort(array);
	}
	
	public void bubbleSort(int...array) {
		int auxiliar = 0;
		int i = 0;
		System.out.println("Array original");
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (i = 0; i < array.length; i++) {
			for (int j = 0; j < (array.length - 1); j++) {
				if (array[j] > array[j + 1]) {
					auxiliar = array[j];
					array[j] = array[j + 1];
					array[j + 1] = auxiliar;
				}
			}
		}
		
		System.out.println("Array ordenado");
		
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
