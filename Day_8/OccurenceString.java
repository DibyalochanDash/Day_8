package Day_8;

public class OccurenceString { // Leet code 28

	public static void main(String[] args) {
		
		String haystack ="butsad";
		String  needle ="sad";
     
		int ans = strStr(haystack,needle);
	System.out.println(ans);
	
	
	AnotherMethod(haystack,needle);
	}

private static void AnotherMethod(String haystack, String needle) {
	System.out.println(haystack.indexOf(needle));
	
}

private static int strStr(String haystack, String needle) {

	for (int i = 0; i < haystack.length()-needle.length()+1 ; i++) {
		if (haystack.charAt(i)==needle.charAt(0)) {
			if (haystack.substring(i,needle.length()+i).equals(needle)) {
				
				return i;
			}
		}
	}
	return -1;
  }
  
}
