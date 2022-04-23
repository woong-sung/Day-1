public class StringApp{
	public static void main(String[] args) {
		// character VS String
		System.out.println("Hello World"); // String
		System.out.println('H'); // Character
		System.out.println("H"); // String
		
		System.out.println("Hello "
				+ "World");                 // 그냥 엔터 쳤을 경우
		
		//new line
		System.out.println("Hello \nWorld");  //\n 을 입력하면 줄바꿈
		
		//escape line
		System.out.println("\"Hello World\"");  //\뒤에 따옴표는 탈출문자
	}
}