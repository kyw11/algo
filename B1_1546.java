package BOJ;

import java.util.Scanner;

public class B1_1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //과목 갯수
		int[] arr = new int[N];  //점수를 받을 배열
		int max=0;  //점수 중에 가장 큰 값
		int sum =0;  //총합
		double avg = 0.0;  //진짜 평균
		
		
		for(int i=0;i<N;i++) {  //점수 입력 받아
			arr[i] = sc.nextInt();
			if(max<arr[i])  //점수 중에 가장 큰 값 찾기 
				max = arr[i];
			sum+=arr[i];
			
		}
		
		avg = 100.0 * sum / max / N;
		System.out.println(avg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
