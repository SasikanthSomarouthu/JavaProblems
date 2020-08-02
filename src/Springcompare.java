   import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Springcompare {

	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		String d=sc.next();
		String result=solve( n,k,s,d);
		
		System.out.println("The substring is ---"+result);
		
		
	}

	private static String solve(int n, int k, String s, String d) {
		// TODO Auto-generated method stub
		String input=s;
		if(n>0&&k>0) {
		Pattern p=Pattern.compile("$" +input + "$");
		System.out.println("string is"+input +p);
	Matcher matc= p.matcher(d);
	boolean f=matc.find();
	System.out.println(matc);
		
		if(d.indexOf(s)>0) {
			return "YES";
		}
		else {
			System.out.println("contains no string");
			return "NO";
		}
	}
		return "NO";
}}