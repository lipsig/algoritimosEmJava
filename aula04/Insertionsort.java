package ordenacao;

import java.util.Arrays;

 // a ordenação irsetion

public class Insertionsort {
		public void FazInsertionSort(int[] array) {
		int aux;
		for (int i = 1;i < array.length;i++) {
			for(int j = i;j>0;j--) {
				if(array[j] < array[j-1]) {
					aux = array[j];
					array[j] = array[j-1];
					array[j-1] = aux;
				}
			}
		}
	}
		public static void main(String[] args) {
			Insertionsort teste = new Insertionsort();
			
			int[] array = {200,50,100,30,2,1,4,5}; 
			
			teste.FazInsertionSort(array);
	
			System.out.println(Arrays.toString(array));
	}
}