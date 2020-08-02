import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String str="sa@ik#nth";
		char[] st=str.toCharArray();
		
		String s = null;
		
		//sc.close();
	
		int l=0; 
		int r=str.length()-1 ;
		
		
		while(l<r) {
			
		if(!Character.isAlphabetic(st[l])) {
			l++;
		}
		else if (!Character.isAlphabetic(st[r])){
			r--;
			
		}
		else {
			char temp = st[l];
			st[l]=st[r];
			st[r]=temp;
			l++;
			r--;
			
		}
			
		}
	    
	
		System.out.println(new String(st));

	}

}
