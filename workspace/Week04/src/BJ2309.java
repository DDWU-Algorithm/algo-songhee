import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
			sum += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
				// 인덱스 i, j를 빼면 100이 되는지 확인
				if(i != j && sum - arr[i] - arr[j] == 100) {
					int num1 = arr[i];
					int num2 = arr[j];

					Arrays.sort(arr);
					
					// 출력
					for (int k = 0; k < arr.length; k++) {
						if(arr[k] != num1 && arr[k] != num2) {
							System.out.println(arr[k]);
						}
					}
					return;	// 이렇게 써도 되는지...? 
				}
			}
		}
		
		
	}
}
