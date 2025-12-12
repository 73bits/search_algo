public class Main {
	public static void main(String ... args) {
		int[][] accounts = new int[][] {
			{2, 3, 4},
			{1, 50, 4},
			{9, 13, 4}
		};

		System.out.println(maximumWealth(accounts));
		System.out.println(maximumWealthEnhanced(accounts));
	}

	public static int maximumWealth(int[][] accounts) {
		int maxWealth = Integer.MIN_VALUE;
		for (int customer = 0; customer < accounts.length; customer++) {
			int total = 0;
			for (int account = 0; account < accounts[customer].length; account++) {
				total = total + accounts[customer][account];
			}
			if (total > maxWealth) {
				maxWealth = total;
			}
		}
		return maxWealth;
	}

	public static int maximumWealthEnhanced(int[][] accounts) {
		int maxWealth = Integer.MIN_VALUE;
		for (int[] account : accounts) {
			int total = 0;
			for (int amount : account) {
				total = total + amount;
			}
			if (total > maxWealth) {
				maxWealth = total;
			}
		}
		return maxWealth;
	}
}
