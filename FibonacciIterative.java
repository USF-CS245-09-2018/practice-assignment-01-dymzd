public class FibonacciIterative implements Fibonacci {
	
	public int fibonacci(int n){

		int first = 0;
		int second = 1;
		int temp = 0; 
		
		//0,1,1,2,3,5
		if(n == 0) {
			return first;
		} else if(n == 1) {
			return second; 
		}
		
		for(int i = 2; i <= n; i++){
			temp = first + second; 
			first = second;
			second = temp;
		}

		return temp;
	}

}