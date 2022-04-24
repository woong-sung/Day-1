
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double)1;

		System.out.println(b);
		// 1.1을 정수로표현시 오류
//		int c = 1.1;
		// 해결방법
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e);
		
		//1 to String
		String f = Integer.toString(1);
		System.out.println(f);
		System.out.println(f.getClass());
		
	}

}
