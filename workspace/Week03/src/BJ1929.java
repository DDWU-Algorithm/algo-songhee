import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1929 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 배열 생성
		boolean isPrimeNum[] = new boolean[1000001];
		
		// m, n 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i <= n; i++) {
			isPrimeNum[i] = true;
		}
		
		isPrimeNum[0] = isPrimeNum[1] = false;
			
		for (int i = 0; i <= n; i++) {
			if(isPrimeNum[i]) {
				
				// i값이 범위에 해당되는지 확인 후 출력
				if(i >= m) {	
					System.out.println(i);	
				}
				
				// 소수 아닌 값 지우기
				for (int j = 2; i * j <= n; j++) {
					isPrimeNum[i * j] = false; 
				}
			}
		}
		

		/*
		 * int cnt = 0;
		 * 
		 * for (int i = 0; i < n; i++) {
		 * if(isPrimeNum[Integer.parseInt(st.nextToken())]) { cnt++; } }
		 * 
		 * System.out.println(cnt);
		 */
	}
}
