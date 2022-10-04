import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10972 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int n = Integer.parseInt(br.readLine());
		int nums[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 반복문 끝난 이후에도 i값 확인하기 위해 밖으로 뺌
		int i;	
		for (i = nums.length - 1; i > 0; i--) {
			// 배열의 뒤쪽 값(인덱스 i)이 앞쪽 값(인덱스 i-1)보다 더 크다면, 즉 내림차순 정렬이 안되어있다면 if문 들어옴
			if(nums[i] > nums[i - 1]) {
				// 내림차순 정렬이 안되어있는 배열 범위에서 (i-1 제외) 가장 작은 값을 젤 앞(i-1 자리)으로 빼줌
				swap(nums, i - 1, getMinIndex(nums, i));
				
				// 나머지 부분 오름차순 정렬
				Arrays.sort(nums, i, nums.length);
				break;
			}
		}
		
		if(i == 0) {
			System.out.println(-1);
		} else {
			for (int num : nums) {
				System.out.print(num + " ");
			}
		}
		
	}	
	
	// 배열 안의 두 값을 바꿔줌
	static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	// 배열 특정 범위내에서 가장 작은 값의 인덱스 반환
	static int getMinIndex(int arr[], int start) {
		int min = arr[start];
		int index = start;
		
		for (int i = start + 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		
		return index;
	}
}
