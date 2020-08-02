import java.util.HashSet;
import java.util.Scanner;

public class LGpalindrome {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		
		
		sc.close();
		
		if(input==null || input.length()<=0) {
			System.out.println("");
		}
		int start=0;
		int end=0;
		
		for(int i=0;i<input.length();i++) {
			
			int len1=expandFromMiddle(input,i,i);
			int len2=expandFromMiddle(input,i,i+1);
			
			int len=Math.max(len1,len2);
			
			if(len>end-start) {
				start=i-((len-1)/2);
				end=i+(len/2);
				
			}
			
		}
		
		System.out.println(input.substring(start,end+1));
		
		
		
		
		
		
		
		
	}
	
	
	public static int expandFromMiddle(String s,int left,int right) {
		
		if(s==null||left>right)
			return 0;
		
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
			
		}
		
		return right-left-1;
		
		
	}
	
}
