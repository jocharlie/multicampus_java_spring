package 문자열;

public class 문자열포함인덱스테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbccdda";
		System.out.println(s.contains("a"));
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("bc"));
		
		System.out.println(s.indexOf("a")); //첫번째 위치
		System.out.println(s.lastIndexOf("a")); //마지막 위치
		System.out.println(s.lastIndexOf("a", 3)); //0~2 위치
		System.out.println(s.lastIndexOf("a", 10)); //0~8 위치
		
		System.out.println(s.indexOf("f")); //-1
		
	}

}
