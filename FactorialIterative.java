public class FactorialIterative implements Factorial {
	
	public int factorial(int n){
		
		int i;
		if(n==0){
			i = 0;
		} else {
			i = 1;
		}
		for(;n>0;n--){
			i = i * n;
		}
		return i; 
	}

}