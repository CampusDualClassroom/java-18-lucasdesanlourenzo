package com.campusdual.classroom;

public class Exercise18 {




	public static int[] createAndInitializeArray(int tam){
		int[] array= new int[tam];
		for (int i = 0; i <tam ; i++) {
			array[i]= (i+1);

		}
		return array;
	}

	public static void  showInlineArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}







	public static void main(String[] args) {
		int size = 5;
		int[] initializedArray = createAndInitializeArray(size);

		showInlineArray(initializedArray);
	}
}
