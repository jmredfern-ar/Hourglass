
public class Hourglass {

	public static void main(String[] args) {
		
		int x = 7;
		//System.out.println(fact(x));
		
		//x = fact(x);
		//System.out.println(x);
		
		/*
		int y = 10;
		int[] nums = new int[y];
		nums = fibonacci(y);
		for(int i = 0; i < y; i++) {
			System.out.println(nums[i]);
		}
		*/
		
		System.out.println(fib(40));
		
		//drawLine();		
		//drawV();
		//drawLine();
	}

	public static int fact(int x) {
		if(x == 1)
			return 1;
		else 
			return x * fact(x-1);
	}
	
	//Returns an n-sized fibonacci sequence
	public static int[] fibonacci(int n) {
		int[] fib = new int[n+1];
		if(n == 0) {
			fib[0] = 0; //base case #1
		}
		else if(n == 1) { //base case #2
			fib[0] = 0;
			fib[1] = 1;
		}
		else {
			fib[0] = 0;
			fib[1] = 1;
			for(int i = 2; i < n+1; i++) {
				fib[i] = fib[i-1] + fib[i-2];
			}
		}
		return fib;	
	}
	
	public static long fib(long i) {
		if(i == 0) return 0;
		if(i == 1) return 1;
		return fib(i-1) + fib(i-2);
	}
	
	public static void drawLine() {
		System.out.println("+------+");
	}

	public static void drawV() {
		for(int line = 1; line <=3; line++) {
			System.out.print("|");
		
			for(int i = 0; i < line-1; i++) {
				System.out.print(" ");
			}
			
			System.out.print("\\");
			
			for(int i = 0; i < 6 - 2 * line; i++) {
				System.out.print(".");
			}
			
			System.out.print("/");
			
			for(int i = 0; i < line-1; i++) {
				System.out.print(" ");
			}
			
			System.out.print("|");
			System.out.println();
		}
	}
}
