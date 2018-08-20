
package lista;

public class No {
	public Object data;
	public No antes;
	public No depois;
	public No apontaindice;
	
public No (int data) {
	 antes  = null;
	 this.data=data;
	 depois = null;
	 apontaindice = null;
	
}


 public No(No antes, Object data, No depois) {
	 this.antes= antes;
	 this.data=data;
	 this.depois=depois;
	 
	 
	 
 }
 
 public Object data() {
	 return data; 
 }

 


}
