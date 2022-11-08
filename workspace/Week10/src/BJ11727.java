import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class BJ11727 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		System.out.println(solution(n, new Hashtable<>()) % 10007);
	}
	
	private static int solution(int n, Hashtable<Integer, Integer> memo) {
		// 종료 조건
		if(n == 1) {
			return 1;
		} else if(n == 2) {
			return 3;
		} 
		
		// 순환
		int temp;
		
		if(memo.get(n - 1) == null) {
			temp = solution(n - 1, memo);
			temp = temp >= 10007 ? temp % 10007 : temp; 
			memo.put(n - 1, temp);
		}
		
		if(memo.get(n - 2) == null) {
			temp = solution(n - 2, memo);
			temp = temp >= 10007 ? temp % 10007 : temp; 
			memo.put(n - 2, temp);
		}
		
		return memo.get(n - 1) + 2 * memo.get(n - 2);
	}

}
