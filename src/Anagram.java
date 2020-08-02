import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> input=new ArrayList<String>();
		ArrayList<String> output=new ArrayList<String>();
		Map<Integer,ArrayList<String>> output1=new HashMap<Integer,ArrayList<String>>();
		int i=0;
		while(i<4) {
			
			
				
				input.add(sc.next());
				
		
			
			
			i++;
		}
		sc.close();
		
		List<List<String>> result=Anagram.groupAnagrams(input);
		result.stream().forEach(System.out::print);
	}
		
	 public static  List<List<String>> groupAnagrams(ArrayList<String> strs) {
		        List<List<String>> res= new ArrayList<List<String>>();
		    	
		    	HashMap<String, List<String>> map= new HashMap<String, List<String>>();
		    	for(String curr:strs)
		    	{
		    		char[] chars=curr.toCharArray();
		    		Arrays.sort(chars);
		    		String sorted= new String(chars);
		    		
		    		if(!map.containsKey(sorted))
		    			map.put(sorted, new ArrayList<String>());
		    		
		    		map.get(sorted).add(curr);
		    	}
		    	res.addAll(map.values());
		    	return res;
		    }
		}



	
