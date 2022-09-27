import java.util.Iterator;
import java.util.Scanner;

public class BJ9095 {
	public static void main(String[] args) {
		int arr[] = new int[11];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for (int i = 4; i < arr.length; i++) {
			arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[sc.nextInt()]);
		}
	}
}
