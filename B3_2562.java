package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B3_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[31];
		
		Arrays.fill(arr, false);
		
		for(int i=0;i<28;i++) {
			arr[sc.nextInt()] = true; 
		}
		for(int i=1;i<31;i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
		
	}

}
