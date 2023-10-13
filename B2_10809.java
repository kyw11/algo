package BOJ;

import java.util.Scanner;

public class B2_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = -1;
		}
		String S = sc.nextLine();
		
		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			
			if(arr[ch-'a'] ==-1) {   //arr 원소 값이 -1인  경우에만 초기화
				arr[ch -'a'] =i;
			}
		}
		for(int val :arr) {
			System.out.println(val + " ");
		}
		
				
	}
	
}
