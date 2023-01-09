package BOJ;

import java.util.Scanner;

public class B3_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max =0;
		int index = 0;
		
	
		max = arr[0];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<9;i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i+1;
			}
			
		}
		System.out.println(max);
		System.out.println(index);
		
	}

}
