package com.JavaPrograms.String;

public class StringPalindrom {

	public static void main(String[] args) {
		String s = "Kayak";
		int temp = 0;
		char rev[] = new char[s.length()];

		s = s.toLowerCase();

		for (int i = s.length() - 1; i >= 0; i--) {

			rev[temp] = s.charAt(i);

			temp++;
		}

		String rev1 = new String(rev);
		System.out.println(rev1);

		if (s.equals(rev1)) {
			System.out.println("String is palindrom");
		}

		else {
			System.out.println("String is not palindrom");
		}

	}

}
