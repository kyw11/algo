package BOJ;

import java.util.Scanner;

public class B5_27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();  //문자열 받기
		int n = sc.nextInt()-1;   //charAt() 0부터 시작이라서
		
		System.out.println(s.charAt(n));
	}

}
