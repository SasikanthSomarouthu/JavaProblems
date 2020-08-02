import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			sc.close();
			
			int n = s.length();
	        Set<Character> set = new HashSet<Character>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
              //  System.out.print(i);
            }
            else {
                set.remove(s.charAt(i++));
               
            }
        }
  System.out.println(set);
	}}
