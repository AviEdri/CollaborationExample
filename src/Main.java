
public class Main {

	public static void main(String[] args) {
		
		String tmpDirectoryName = System.getenv("TMP");
		System.out.println(tmpDirectoryName);
		
//		int x = 1;
//		Man man = null;
//		
//		f1(x);
//		System.out.println(123);
	}

	private static void f1(int x) {
		x = 3;
		int y = -2;
		Man man = new Man();
		Woman woman = new Woman();
		man.setWife(woman);
	}
	
	
	public static int mult(int num1, int num2) {
		if (num1 == 0) {
			return 0;
		}
		
		return num2 + mult(num1 -1, num2);
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
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	

}
