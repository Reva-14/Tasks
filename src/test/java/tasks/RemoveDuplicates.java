package tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "aabbccddeeffgghhiijjkl";
		String s1 = "";
		Set<Character> s2 = new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++) {
			s2.add(s.charAt(i));
			}
		for(char c : s2) {
			s1 = s1 + c;
		}
		System.out.println("Original String : "+s);
		System.out.println();
		System.out.println("String with unique characters : "+s1);
	}

}
