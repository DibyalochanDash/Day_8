package Day_8;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String s = "Tap Academy";
		
		LastWord(s);

	}

	private static void LastWord(String s) {
		int count = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i)==' ') {
				if(count > 0) {
					break;
				}
			} else {
				count++;

			}
		}
		System.out.println(count);
		
	}

}
