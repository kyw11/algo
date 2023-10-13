package BOJ;

import java.util.Scanner;

public class B2_10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N + 1];

		// 배열안에 값 넣기
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}

		// 반복 하면서 i,j받기

		for (int x = 0; x < M; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			
			
			while(i<j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}

			// 이제 반복 하면서 바꿔야하는데
			// for(int k=i;k<=j;k++) {
//			int tmp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = tmp;
			// }
		}

		for (int i = 1; i <= N; i++) {
			System.out.println(arr[i]);
		}

	}

}

//Scanner sc = new Scanner(System.in); int N = sc.nextInt(); int M =
//sc.nextInt();
//
//int[] arr = new int[N+1];
//
//for(int i =1;i<=N;i++) { arr[i] = i; } for(int k = 0;k<M;k++) { int i =
//sc.nextInt(); int j = sc.nextInt();
//
//for(int h = i;h<=j;h++ ) { int nn = j--;
//
//int tmp = arr[h]; arr[h] = arr[nn]; arr[nn] = tmp; } } for(int i =1;i<=N;i++)
//{ System.out.print(arr[i] + " "); }
//
