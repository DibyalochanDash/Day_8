package Day_8;

public class Step_TO_Reduce {

	public static void main(String[] args) {
		int num = 14;
		
	int ans = Step(num);
	System.out.println(ans);
	
	int res = AnotherMethods(num);
 System.out.println(res);
	}

	private static int AnotherMethods(int num) {
		int count = 0;
		while (num > 0) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
               num = num-1;
			}
			count++;
		}
		return count;
		
	}

	private static int Step(int num) {
		return helper(num,0);
		
	}

	private static int helper(int num, int i) {
		if (num == 0) {
			return i;
		}
		if (num % 2 == 0) {
			return helper(num/2,i+1);
		}
		return helper(num-1,i+1);
	}

}
