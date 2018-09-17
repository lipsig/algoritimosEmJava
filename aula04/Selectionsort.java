package ordenacao;

import java.util.Arrays;

//o selection sort acha o valor minimo em determinado intervalo do array, e faz isso do inicio 
//até o fim estabelecido

public class Selectionsort {
			 
	    public void fazSelectionSort(int[] array){
	         
	        for (int i = 0; i < array.length - 1; i++)
	        {
	            int indice = i;
	            for (int j = i + 1; j < array.length; j++)
	            if (array[j] < array[indice]) 
	            indice = j;
	  
	            int numeromenor = array[indice];  
	            array[indice] = array[i];
	            array[i] = numeromenor;
	        }
	        
	    }
	
	public static void main(String[] args) {
		int[] array = {200,50,100,30,2,1,4,5};
		
		Selectionsort teste = new Selectionsort();
		teste.fazSelectionSort(array);
		System.out.println(Arrays.toString(array));

 	

	}

}
