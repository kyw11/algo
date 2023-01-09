package BOJ;

import java.util.Scanner;

public class B1_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();  //테케 받기
		
		for(int i=0;i<tc;i++) {
			int sum = 0;
			int std = sc.nextInt();  //학생의 수 
			int[] arr = new int[std];
			
			for(int j=0;j<std;j++) {
				arr[j] = sc.nextInt();  //점수 받아 각 줄 마다
				
				
				sum += arr[j];  //총합
			}
			
			double avg = (sum / std);
			double count =0;  // 평균 넘는 학생 수
			
			for(int j=0;j<std;j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/std)*100);
			
		}
	}

}
