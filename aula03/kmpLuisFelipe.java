package KMP;

public class kmpFelipe {

	private void Procurakmp(String substring, String texto){
		
		int tamanhosubstring = substring.length();
		int tamanhotexto = texto.length();
		
		int arraycomputaSubstring[]= new int [tamanhosubstring];
		int indiceSubstring= 0;
		
		processaSubstring(substring, tamanhosubstring, arraycomputaSubstring);
		
		
		 int indicetexto = 0; 
	     while (indicetexto < tamanhotexto) {
	         if (substring.charAt(indiceSubstring) == texto.charAt(indicetexto)) {
	        	 indiceSubstring++;
	        	 indicetexto++;
	         }
	         if (indiceSubstring == tamanhosubstring) {
	             System.out.println("Achou o padrão "
	                                + "no índice: " + (indicetexto - indiceSubstring));
	             indiceSubstring = arraycomputaSubstring[indiceSubstring - 1];
	         }

	   
	         else if (indicetexto < tamanhotexto && substring.charAt(indiceSubstring) != texto.charAt(indicetexto)) {
	        
	             if (indiceSubstring != 0)
	            	 indiceSubstring = arraycomputaSubstring[ indiceSubstring - 1];
	             else
	            	 indicetexto = indicetexto + 1;
	         }
	     }
	 }
		
		
	
	
	private	void processaSubstring(String substring, int tamanhosubstring, int[] arraycomputaSubstring) {
		int g = 0 ;
		int i = 1;
		arraycomputaSubstring[0]=0;
		
		while (i < tamanhosubstring) {
	         if (substring.charAt(i) == substring.charAt(g)) {
	             g++;
	             arraycomputaSubstring[i] = g;
	             i++;
	         }
	         else{
	           if (g != 0) {
	                 g = arraycomputaSubstring[g - 1];	         
	             }
	         else{
	                 arraycomputaSubstring[i] = g;
	                 i++;
	             }
	         }
		}
	         
		
	}


	public static void main(String[] args) {
		kmpFelipe teste = new kmpFelipe();
		
		teste.Procurakmp("Rogerio", "Carlos Marcos Rogerio Rogerio");
			
	}

}
