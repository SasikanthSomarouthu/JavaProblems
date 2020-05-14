import java.util.Scanner;

class LongestPalindrome {
 
	
	 static int resultstart;
	  static int resultlength;
	public static  void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	   String a=sc.next();
	  sc.close();
	
	 System.out.println(longestPalindrome1(a));
	
	 
	}
	 
	public static String  longestPalindrome1(String s) {
		
		int strlength=s.length();
		
		if(strlength < 2) {
			return s;
		}
		for(int start=0;start<strlength-1;start++)
		{
			expandRange(s,start,start);
			expandRange(s,start,start+1);
		}
		return s.substring(resultstart, resultstart+resultlength);
		 
		 
	 }

	private static void expandRange(String s, int start, int end) {
		
		while(start >=0 && end <=s.length() &&  s.charAt(end)==s.charAt(start)) {
			start--;
			end++;
		}
		if(resultlength < end-start-1) {
			resultstart=start+1;
			resultlength=end-start-1;
			
		}
	  
	}
	  
}
	   
	   
	
	
	
