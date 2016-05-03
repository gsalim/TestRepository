package test;

public class Test {

	public static String getStringOf(String str, int slot) {

		int count = 0, a = 0, b = str.length();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '|') {
				count++;
				if (count == slot - 1) {
					a = i + 1;
				} else if (count == slot) {
					b = i;
					break;
				}
			}
		}

		if (slot > count + 1) {
			return null;
		}
		return str.substring(a, b);
	}

	public Test() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a|bb|ccc|ddd|eee|fff";

		System.out.println(getStringOf(str, 4));
		// https://github.com/gsalim/TestRepository.git
		System.exit(0);
	}
}
