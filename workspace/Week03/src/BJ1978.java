import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BJ1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		boolean isPrimeNum[] = new boolean[1001];
		
		for (int i = 0; i < isPrimeNum.length; i++) {
			isPrimeNum[i] = true;
		}
		
		isPrimeNum[0] = isPrimeNum[1] = false;
			
		for (int i = 0; i < isPrimeNum.length; i++) {
			if(isPrimeNum[i]) {
				for (int j = 2; i * j < 1001; j++) {
					isPrimeNum[i * j] = false; 
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			if(isPrimeNum[Integer.parseInt(st.nextToken())]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
