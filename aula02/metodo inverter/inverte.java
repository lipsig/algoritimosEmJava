
public class inverte {
	
	public void invertefila(fila Teste) {
		int[] dados = new int[10];
		
		for (int i=0; i<10; i++) {
			dados[i]= Teste.pop;
		}
		for (int i=0; i<10; i++) {
			Teste.push(dados[i]);
		}
		
		
		
		
	}

}