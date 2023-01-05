package day_0105_algo;

import java.util.Scanner;

public class BOJ10807_B5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//배열 크기
		int[] arr = new int[N];
		//int V = sc.nextInt();//찾는 수
		int cnt =0;  //갯수
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();  //배열 입력 받기
			
		}
		int V = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==V)
				cnt++;
		}
		System.out.println(cnt);
	}

}
