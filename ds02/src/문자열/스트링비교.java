package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "정길동";
			String s2 = "정길동";
			
			System.out.println(s);
			System.out.println(s2);
			//String이 가르키는 char들이 동일한지 equals()
			System.out.println(s.equals(s2));
			System.out.println(s = s2); //true???
			s="김길동";
			System.out.println(s.equals(s2));
			System.out.println(s = s2);
			
			//String을 사용하는 것은 좋으나,
			//String의 값이 자주 변경되는 경우는 비효율적!
			StringBuilder builder = new StringBuilder();
			builder.append("송길동");
			System.out.println(builder);
	}

}
