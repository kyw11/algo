package BOJ;

import java.util.Scanner;

public class B3_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.print(min + " ");
		System.out.print(max);

	}

}



/*예전에 풀었던 방법
 * public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //정수 개수
		
		int[] arr =new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
			
		}
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N-1]);
    }
}
 * 
 * 
 */
