package 배열;

public class 배열랜덤값구하기 {

	public static void main(String[] args) {
		int[] s = {90, 80, 20, 60, 70};
		int min = s[0];
		
		
		for (int x :s) {
			if(x<min) min =x;
		}//for
		System.out.println("최소값은"+ min);
		
		
	}

}
