import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int a = num1 > num2? num1 : num2;
		int b = num1 < num2? num1 : num2;
		
		int gcd = getGCD(a, b);
		
		System.out.println(gcd);
		System.out.println(a * b / gcd);
	}
	
	private static int getGCD(int a, int b) {
		int r = a % b;
		
		if(r == 0) {	// 종료 조건
			return b;
		} else {		// 재귀 호출
			return getGCD(b, r
					);
		}
	}
}
