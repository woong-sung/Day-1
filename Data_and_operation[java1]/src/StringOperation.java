
public class StringOperation {

	public static void main(String[] args) {
		// A.length() = 문자열의 길이
		System.out.println("Hello World".length()); 
		// A.replace(a,b) = a를 b로 대체
		System.out.println("Hello, [name] ... bye.".replace("[nam]e","Josh"));
		
		//// 추가학습
		
		//A.equals(B) = A와B가 같은지 비교해서 T,F로 출력
		System.out.println("Apple".equals("Banana"));
		System.out.println("Apple"=="Banana");
		System.out.println("Apple".equals("Apple"));
		System.out.println("Apple"=="Apple");
		
		//A.indexof(B) = A에서 B가 나오는 인덱스를 출력
		System.out.println("감사합니다".indexOf("사"));
		
		//A.substring(a) = A에서 a인덱스에서 끝까지 해당하는 값을 출력 
		//A.substring(a,b) = A에서 a인덱스에서 b-1인덱스까지 해당하는 값을 출력 
		System.out.println("감사합니다여러분".substring(3));
		System.out.println("감사합니다여러분".substring(3,5));
		
		//A.toUpperCase() = 모두 대문자 변경
		//A.toLowerCase() = 모두소문자 변경
		System.out.println("Hello World".toUpperCase());
		System.out.println("Hello World".toLowerCase());
		
		//A.startWith(a) = 문자열이 a 로시작하면 T, 아니면 F
		//A.endWith(a) = 문자열이 a 로끝나면 T, 아니면 F
		
		//A.split(a) = A문자열을 a마다 잘라서 배열에 넣는다
		String str = "iKLoveKU";
		String[] strArr = str.split("K");
		System.out.println(strArr[1]);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        
        //A.trim() = 문자열의 시작과 끝에있는 공백을 없애준다. (중간의 공백은 안없앤다.)
		System.out.println(" Hello   World ");
		System.out.println("Hello   World".trim());
		
		//A.contains(a) = 문자열에서 a를 포함하고있으면 T 아니면 F
		System.out.println("Hello World".contains("W"));
		System.out.println("Hello World".contains("A"));
		
		//A.charAt(a) = A문자열에서 a인덱스번째 문자를 반환한다.
		System.out.println("Hello World".charAt(6));
		
	
		
	}

}
