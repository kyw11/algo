package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B5_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[28];
		
		for(int i=0;i<student.length;i++) {
			student[i] = sc.nextInt();
		}
		Arrays.sort(student);
		String not=Arrays.toString(student);
		
		for(int i=0;i<student.length;i++) {
			if(student[i+1] != i+1) {
				// not = i+1;
				System.out.println(not);
			}
		}
	}

}
