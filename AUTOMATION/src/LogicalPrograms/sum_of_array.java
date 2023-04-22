package LogicalPrograms;

import java.util.Arrays;

public class sum_of_array {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Sum of Array:" + sum);// 210

		System.out.println("---Sort array in ascending order---");
		Arrays.sort(arr);

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---Sort array in descending order---");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}
}
