package BOJ;

import java.util.Scanner;

public class B2_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i =0;i<T;i++) {
			
			int R = sc.nextInt();
			String s = sc.next();  //nextLine()�� ���� ���� ���� �о X
			
			for(int j=0;j<s.length();j++) {  //S���ڿ� ���� ��ŭ �ݺ�
				for(int k=0;k<R;k++) {  //���ڵ� R��ŭ �ݺ��ϱ�
					System.out.print(s.charAt(j));
					
				}
				
			}
			System.out.println();
			
		}
	}

}
