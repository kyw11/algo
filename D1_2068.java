package SW;

import java.util.Scanner;

public class D1_2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[10];
		
		for(int i=1;i<=T;i++) {
			int max =0;  // 최대수
			
			for(int j =0;j<10;j++) {
				arr[j] = sc.nextInt();
				if(max <arr[j]) {
					max = arr[j];
				}
			}
			System.out.println("#"+i+" "+max);
		}
		sc.close();
	}

}
