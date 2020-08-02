import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {
	
	  public static boolean isPrime(int p1) {
		  
		  IntPredicate isDivisible = index -> p1 % index == 0;
	    	return p1> 1 && IntStream.range(2,p1).noneMatch(isDivisible);
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    List<String> s=new ArrayList<String>();
//    s.add("Sasikanth");
//    s.add("Rahul");
//    s.add("Rahul");
//    
//    
//    
//    s.stream().forEach(System.out::println);
//    
//    HashMap<Integer, String> p=new HashMap<Integer, String>();
//    p.put(2,"Sasikanth");
//    p.put(3,"Teja");
//    
//    s.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
//    
    
     List<Integer> randomNum = new ArrayList<Integer>();
     int  i=0;
     while(i< 6) {
    	 int nextInt = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		randomNum.add(nextInt);
    	 System.out.println(nextInt);
    	 i++;
     }
     
  
randomNum.stream().filter(Example::isPrime).forEach(System.out::println);
	
//    
//   for( Entry<Integer, String> entry : p.entrySet()) {
//	   
//	   System.out.println("key="+entry.getKey()+"value="+entry.getValue());
//   }
//    
    
		
		
	}

}
