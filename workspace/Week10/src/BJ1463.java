import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class BJ1463 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(calc(n, new Hashtable<Integer, Integer>()));
	}
	
	private static int calc (int n, Hashtable<Integer, Integer> memo) {
//		System.out.println("현재 n값: " + n);
		
		int n1 = Integer.MAX_VALUE;
		int n2 = Integer.MAX_VALUE;
		int n3 = Integer.MAX_VALUE;
		
		// 종료 조건
		if(n == 1) {
			return 0;
		} 
		
		// 순환
		if(memo.get(n) == null) {
			if(n % 3 == 0 ) {
				n1 = calc(n / 3, memo) + 1;
			} 
			if(n % 2 == 0) {
				n2 = calc(n / 2, memo) + 1;
			} 
			n3 = calc(n - 1, memo) + 1;
			
			// 가장 작은 값이 memo에 들어감
			int min = getMin(n1, n2, n3);
			memo.put(n, min);
		}
		
		return memo.get(n);
	}
	
	private static int getMin (int n1, int n2, int n3) {
		if(n1 >= 0 && n1 < n2 && n1 < n3) {
			return n1;
		} else if(n2 >= 0 && n2 < n1 && n2 < n3) {
			return n2;
		} else {
			return n3;
		}
	}
}
