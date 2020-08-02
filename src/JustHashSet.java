import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class JustHashSet {

	public static void main(String[] args) {
		HashSet<Character> hs=new HashSet<Character>();
		//ArrayList<String> as=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//Character s = str.toCharArray();
         
		sc.close();
		
		int i=0;
		int max=0;
		while(i<str.length()) {
			if(!hs.contains(str.charAt(i)))
			{
				hs.add(str.charAt(i));
				System.out.println("size of array"+str.charAt(i));
		   max=Math.max(max,hs.size());
		   i++;
				
			}
		else{
			i++;
			max=0;
			
		}
			
		}
		
		System.out.println(max);

	}

	private static void add(char charAt) {
		// TODO Auto-generated method stub
		
	}

}
