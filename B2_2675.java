package BOJ;

import java.util.Scanner;

public class B2_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i =0;i<T;i++) {
			
			int R = sc.nextInt();
			String s = sc.next();  //nextLine()을 쓰면 공백 까지 읽어서 X
			
			for(int j=0;j<s.length();j++) {  //S문자열 길이 만큼 반복
				for(int k=0;k<R;k++) {  //문자들 R만큼 반복하기
					System.out.print(s.charAt(j));
					
				}
				
			}
			System.out.println();
			
		}
	}

}
