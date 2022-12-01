import java.util.Arrays;
import java.util.Scanner;

class first {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the length of the Array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter the Array :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for (int it : arr) {
			System.out.println(it);
		}
	}
}