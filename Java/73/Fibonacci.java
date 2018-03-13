public class Fibonacci{
	public static int fib_recurrence(int n) { // I made it a class method b/c it doesn't need any instance variables
		if (n <= 2)
			return 1; //base case
		else // choice b/w cases
			return (fib_recurrence(n-1) + fib_recurrence(n-2)); // recursive case
	}
	
	public int fib_grade8(int n) { // order n
		int twoBefore = 1;
		int oneBefore = 1;
		int fibby = 1;
		for (int x = 3; x < n + 1; x++) {
			fibby = oneBefore + twoBefore;
			twoBefore = oneBefore;
			oneBefore = fibby;
		}
		return fibby;
	}
	
	public int fib_Binet(int n) {
		return (Math.pow(((1 + Math.sqrt(5))/2),n) + Math.pow(((1 - Math.sqrt(5))/2),n))/2
}
}
		
		
		
		