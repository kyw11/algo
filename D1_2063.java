package SW;

import java.util.Arrays;
import java.util.Scanner;

public class D1_2063 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int num =0;
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();  //숫자를 다 받고
		}
		Arrays.sort(arr);
		//num = arr.length/2+1;
		for(int i =0;i<arr.length;i++) {
			num = arr[arr.length/2];
			//System.out.print(arr[i]+ " ");
		}
		System.out.println(num);
		sc.close();
	}

}
