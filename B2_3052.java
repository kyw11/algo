package BOJ;
/*
 * HashSet 사용법도 있는데 영원이는 지금 배열 공부 중이라서 
 * 배열로 풀었다~
 * 
 */
import java.util.Scanner;

public class B2_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[42];
		
		for(int i=0;i<10;i++) {
			arr[sc.nextInt()%42] = true;
			
		}
		int count =0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		System.out.println(count);
	}

}
