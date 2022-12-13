class Math {
	int add(int a, int b) {
		return a + b;
	}
	
	int minus(int a, int b) {
		return a - b;
	}
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
}


public class ClassEx {

	public static void main(String[] args) {
		Math a = new Math();
		
		int result = a.add(2, 3);
		System.out.println(result);
		
		int result1 = a.minus(5, 8);
		System.out.println(result1);
		
		int result2 = a.max(12, 9);
		System.out.println(result2);
	}

}
