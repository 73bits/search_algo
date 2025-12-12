public class SearchInString {
	public static void main(String ... args) {
		String name = "prashant";
		System.out.println(searchString(name, 's')); // true
		System.out.println(searchString(name, 'i')); // false

		System.out.println(searchString2(name, 's')); // true
		System.out.println(searchString2(name, 'i')); // false
	}

	public static boolean searchString(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

		for (char ch : str.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}
		return false;
	}

	public static boolean searchString2(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
