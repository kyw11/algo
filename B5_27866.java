package BOJ;

import java.util.Scanner;

public class B5_27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();  //���ڿ� �ޱ�
		int n = sc.nextInt()-1;   //charAt() 0���� �����̶�
		
		System.out.println(s.charAt(n));
	}

}
