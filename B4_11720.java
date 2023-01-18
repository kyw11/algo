package BOJ;

import java.util.Scanner;

public class B4_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //숫자의 개수
		String str = sc.next();  // int형으로 받으면 안 돼 왜냐면 공백없이 숫자를 받거등
		int sum = 0;  // 숫자의 합
		
		for(int i =0;i<N;i++) {   //N번 반복돌아서 
			sum+=str.charAt(i)-'0'; // str 문자열을 charAt()으로 쪼개서 sum에 더해서 넣기 
									//charAt(i)인 이유는 str 0번째 부터 N-1번째 문자열까지 하랴고 -'0'은 charAt()은 아스키코드 값을 내기 때문에 원하는 값을 원하기 위해서 
		}
		System.out.println(sum);
	}

}
