package StringExamples;

public class Palindrome {

	public static boolean isPalindrome(String str){
		
		boolean result =false;
		str = str.replaceAll("[.,!?]", "");
		StringBuilder str2 = new StringBuilder(str);
		String str3 =str2.reverse().toString();
		if(str3!=null && str3.equals(str)){
			result=true;
		}
		return result;
	}
	
	public static void main(String args[]){
		System.out.println(isPalindrome("treerte"));
	}
}
