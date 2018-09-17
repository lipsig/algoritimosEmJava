package ordenacao;
import java.util.Arrays;


//o bubblesort vai vendo se o atual é maior que o proximo e vai trocando, ele faz varias passadas em "bolha"
//na ultima passada não pode ocorrer nenhuma troca.

public class BubbleSort {
	 public void bubbleSort(int array[])	 {
		 
		 int n = array.length;
		 for (int i = 0;i< n-1; i++)	 
			 for (int j = 0;j < n-i-1;j++)	 
			if (array[j]>array[j+1]){
			 // troca auxiliar e array[i]	 
			 int aux = array[j];
			 array[j] = array[j+1];
			 array[j+1] = aux;
		}
	}
	 
	 public static void main(String[] args) {
			int[] array = {200,50,100,30,2,1,4,5};
			
			BubbleSort teste = new BubbleSort();
			teste.bubbleSort(array);
			System.out.println(Arrays.toString(array));
	
	 	}
}