public class Main {
	public static void main(String ... args) {
		int[] arr = new int[] {4, 5, 190, -67, 23};
		System.out.println("maximum number: " + searchMaximumNumber(arr));
		System.out.println("minimum number: " + searchMinimumNumber(arr));
	}

	public static int searchMaximumNumber(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static int searchMinimumNumber(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}
}
