package Day_8;

import java.util.HashMap;

public class WordPattern {  // Leet code 290

	public static void main(String[] args) {
		
		String pattern ="abba";
		String s ="dog cat cat dog";
       
		System.out.println(WordPatterns(pattern,s));
	}

private static boolean WordPatterns(String pattern, String s) {
     
	String[] arr = s.split(" ");
	if (pattern.length() != arr.length) {
		return false;
	}
	HashMap<Character , String> hm = new HashMap<Character , String>(); 
	for (int i = 0; i < pattern.length(); i++) {
		char ch =pattern.charAt(i);
		boolean containsKey = hm.containsKey(ch);
		if (hm.containsValue(arr[i]) && !containsKey) {
			return false;
		}
		if (containsKey && !hm.get(ch).equals(arr[i])) {
			return false;
		}
		else {
			hm.put(ch, arr[i]);
		}
	}
	return true;
}

}
