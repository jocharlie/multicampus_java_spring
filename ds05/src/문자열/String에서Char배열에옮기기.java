package 문자열;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String에서Char배열에옮기기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "s205621";
		// 01234
		
		char c1 = s.charAt(3);
		char c2 = s.charAt(4);
		
		String s2 = String.valueOf(c1) + String.valueOf(c2);
		System.out.println(s2);
		
		
		
		System.out.println(s.substring(3, 5));//3~4까지
		char[] result = new char[2];
		s.getChars(3, 5, result, 0);
		System.out.println(Arrays.toString(result));
		
		
		char[] result2 = new char[7];
		s.getChars(0, 7, result2, 0);
		System.out.println(Arrays.toString(result2));
		
		//모든 글자를 char[]로 옮겨보세요.
		String[] all = s.split("");
		System.out.println(all[0] + all[all.length-1]); //10
		
		
	}

}
