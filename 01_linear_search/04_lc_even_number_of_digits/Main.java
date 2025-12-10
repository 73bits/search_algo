public class Main {
	public static void main(String ... args) {
		int[] arr = new int[] {0, -12, 234, 2, 5, 7896};
		System.out.println(findNumbers(arr));
	}

	public static int findNumbers(int[] arr) {
		int count = 0;
		for (int num : arr) {
			int digits = 0;
			if (num == 0) {
				digits = 1;
			}

			while (num != 0) {
				num = num / 10;
				digits++;
			}

			if (digits % 2 == 0) {
				count++;
			}
		}

		return count;
	}
}
