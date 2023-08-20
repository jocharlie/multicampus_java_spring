package 배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열 {

	public static void main(String[] args) {
		// 배열을 만드는 방법1
		// 배열만들때 값을 알고 있는 경우
		int[] ages= {60, 55, 30, 20, 10};//
		
		
		// 배열을 만드는 방법2
		// 배열을 만들 때는 모르고 있다가 나중에 넣는 경우
		double[] weight = new double [5];
		weight[0] = 77.8;
		weight[1] = 50.4;
		weight[2] = 81.4;
		weight[3] = 92.4;
		weight[3] = 40.4;
		
		//for문 2가지
		//1)c타입
		for (int i = 0; i < weight.length; i++) {
			System.out.println(ages[i] + " " + weight[i]);			
		}
		//2) for- each
		for (double d : weight) {
			System.out.println(d);
			
		}
	
		

	}

}
