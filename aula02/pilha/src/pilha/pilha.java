package pilha;

public class pilha {

	int elementos [];
	int topo;
	
	public pilha () {
		elementos = new int[10]; //tamanho fixo da pilha
		topo = -1; //posicao invalida
		
	}
	
	public void push(int e) {
		if(isFull()) {
			throw new RuntimeException ("Pilha cheia");
		}
		topo++;
		elementos[topo]=e;
	} //passar inteiro na pilha
	
	public int pop() {//retornar o numero inteiro
		if(isEmpty()) {
			throw new RuntimeException ("Pilha vazia");
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;
	}
	
	public boolean isEmpty() {
		if (topo== -1) {
			return true;
		}
		return false;
	}//	ver se ta cheio
	
	
	public boolean isFull() {
		return (topo==9);
	}//se ta cheio
	
	public int top () {
		return elementos[topo];
	} //retornar o elemento do topo
	
	
	
	
	
}
