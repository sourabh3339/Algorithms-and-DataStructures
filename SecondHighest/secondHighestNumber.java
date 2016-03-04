import java.util.Arrays;
import java.util.Collections;

public class secondHighestNumber {
	public static void main(String[] args) {
		String args1[] = { "232131223", "7", "2325", "987979", "2323232", "256232" };
		int len = args1.length;
		Integer arr[] = new Integer[len];

		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(args1[i]);
		}
		for (int i : arr) {
			System.out.print(i + ",");
		}

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println();
		for (int i = 0; i < len; i++) {
			if (arr[i + 1] != arr[i]) {
				System.out.println(arr[i + 1]);
				break;
			}
		}
	}
}
