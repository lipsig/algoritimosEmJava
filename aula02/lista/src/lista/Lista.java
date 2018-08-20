package lista;
public class Lista  {
	private static No head;
	private static No tail;
	
public Lista() {
	head= null;
	tail= null;
	}
public void addComeço(Object data) {
	if (head ==null && tail ==null) {
			head = new No(null, data, null);
		    tail = head;
		    }
	else {
			No NovoNo = new No(null, data, head);
			head.antes = NovoNo;
			head= NovoNo;
	}
	}

public void addFim(Object data) {
	    if (head ==null && tail ==null) {
		    head = new No(null, data, null);
	        tail = head;
	    }
		else {
			No atual = tail;
			while(atual.depois!= null) { //se depois do tail tiver alguma coisa
				atual = atual.depois; // o atual será o depois do proximo. ate achar o null 
				//quando achar sera o atual. (esta procurando o tail que aponte para null)
			}
			No NovoNo = new No (atual, data, null); //criando um no no ultimo lugar
		 atual.depois= NovoNo; //o penultimo aponta para o ultimo
		 tail=NovoNo;
		}
	}

public void next(No atual) {
	atual=atual.depois;
}
public void print() {
		No atual = head;
		while (atual!= null) {
			System.out.print("["+atual.data()+"]");
			atual = atual.depois;
		}
		
		System.out.println("");	}
public boolean isEmpty() {
		return head ==null;
	}


public void removeComeço() {
		if (head==null) return;
		head = head.depois;
		head.antes= null;
	}


public void removeFim() {
		if(tail==null) return;
	    if(tail.depois == null) {
	    tail = null;
	    return;
	    }
	    No atual = head;
	    while(atual.depois.depois !=null) 
	    	{
	    	atual  = atual.depois;
	    }
	    atual.depois=null;
	}


public static void main(String[] args) {
		Lista teste = new Lista();
	}
}