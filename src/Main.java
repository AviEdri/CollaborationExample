
public class Main {

	public static void main(String[] args) {

		String tmpDirectoryName = System.getenv("TMP");
		System.out.println(tmpDirectoryName);
		
		int answer = average(4,10);
		System.out.println(answer);
		
//		int x = 1;
//		Man man = null;
//		
//		f1(x);
//		System.out.println(123);
	}
	
	// Sasi was here..

	private static int average(int num1, int num2) {

		int average = (num1 + num2 )/ 2;

		return average;
	}

	private static void f1(int x) {
		x = 3;
		int y = -2;
		Woman woman = new Woman();
//		man.setWife(woman);
	}

	public static int mult(int num1, int num2) {
		if (num1 == 0) {
			return 0;
		}

		return num2 + mult(num1 - 1, num2);
	}

	public static int div(int num1, int num2) {
		if (num1 < num2) {
			return 0;
		}

		return 1 + div(num1 - num2, num2);
	}

	public static int mod(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		}

		return mod(num1 - num2, num2);
	}
	
	public static int theBestSumFunction(int num1, int num2) {
		return num1+num2;
	}
	
	

	
	

	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
