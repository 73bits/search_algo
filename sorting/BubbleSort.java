public class BubbleSort {
	public static void main(String ... args) {
		System.out.println(java.util.Arrays.toString(bubbleSort(new int[] { 3, 1, 0, -82, 73, 991, 5 })));
	}

	private static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
}
