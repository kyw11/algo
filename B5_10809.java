package BOJ;

import java.util.Scanner;

public class B5_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();  //단어 입력 받기
		int[] arr = new int[26];//a-z까지 담을 배열
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;  // -1로 초기화
		}
		
		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {  //arr 원소 값이 -1인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
		for(int val : arr) {
			System.out.print(val + " ");
			 
		}
		
	}

}
