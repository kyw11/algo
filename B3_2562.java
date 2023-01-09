package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B3_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[31];  //학생 수가 30명이라서 31이 맞아 
		
		for(int i=1;i<29;i++) {
			int success = sc.nextInt();  // 제출한 사람 입력받아
			student[success] =1;  // 제출한 사람 배열 값 1로 바꿔
			
			
		}
		/////2023.01.09 방금 내가 for문 하나로 다 안되나? 이런 생각을 했는데 안돼
		////왜냐면  첫 번째 for문은 입력을 받는 곳인데 그래서 28까지만 받았거든
		////근데 출력 그러니까 제출 안한 사람을 찾으려면 student길이만큼 다 돌아야 하거든
		for(int i=1;i<student.length;i++) {
			if(student[i] != 1)
				System.out.println(i);
		}
		
		
	}

}
