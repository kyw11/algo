package SW;

import java.util.Scanner;

public class D1_2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum =0;
		for(int i =0;i<str.length();i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
	
		
	}

}
