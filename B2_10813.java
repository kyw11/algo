package BOJ;
// 공 바꾸기 tmp 생각을 못함
import java.util.Scanner;

public class B2_10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  // 바구니 갯수
		int[] arr = new int[N];  //배열 크기는 N만큼 주고
		int M = sc.nextInt();  //공을 바꾸는 횟수
		int tmp = 0;
		//기존 배열에 1~N까지 차례 숫자 넣는 방법 이거 말고 뭐 있냐?
		for(int i =0;i<N;i++  ) {
			arr[i]= i+1;
		}
		for(int i = 0;i<M;i++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			tmp = arr[I-1];
			arr[I-1] = arr[J-1];
			arr[J-1] = tmp;
		}
		for(int i =0;i<N;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
