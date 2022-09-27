import java.util.Scanner;

public class BJ1748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;		// 자리수 누적
		int digit = 1;		// 현재 자리수
		int temp = 10;		// 비교기준으로 삼을 숫자 (1,10,100,1000,...)
		
		for (int i = 1; i <= n; i++) {
			// 예) n이 10이 되어 들어오면 digit이 1증가해서 2(두자리)가 됨
			if(i >= temp) {	
				temp *= 10;
				digit++;
			}
			
			// result 변수안에 들어온 n의 자리수 누적 
			result += digit;

			//System.out.printf("현재 자리수는 %d, temp값은 %d, result는 %d\n", digit, temp, result);
		}
		
		System.out.println(result);
	}
}
