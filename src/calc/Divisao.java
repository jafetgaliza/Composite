package calc;

import java.util.ArrayList;
import java.util.List;

public class Divisao implements Iexpressao {

	private List <Iexpressao> num = new ArrayList<Iexpressao>();
	
	public Divisao(){
		
		
	}
	
	public void add(Iexpressao n){
		num.add(n);
	}
	
	public int avaliar(){
		int result = 0;
		for(int i=0; i < num.size(); i++)
			result /= num.get(i).avaliar();
		return result;
	}
	 
	
	
}
