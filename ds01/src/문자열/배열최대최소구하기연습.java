package 문자열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열최대최소구하기연습 {
//1번문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//자바프로그램과 콘솔(키보드)를 스트림(강물) open
		int[] s = new int[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
			//입력받아서, int로 바꾼후, 배열에 넣어라!
		}
		
		int min = s[0];
		sc.close();//stream close
		for (int x : s) {
			if(x<min) min =x;
		}
		sc.close();//stream close
		
		System.out.println("최소값은"+ min);
		
		
		
	
	}//main

}