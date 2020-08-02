import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;



public class Testing {


	static boolean Prime(int i) {
		IntPredicate predicate=index->i % index==0;
		return i> 1&& IntStream.range(2, i).noneMatch(predicate);
		
	}
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("java.version"));
	}
		
//		Scanner sc=new Scanner(System.in);
//		int limit=sc.nextInt();
//		
//		
//		ArrayList<Integer> a=new ArrayList<Integer>();
//		
//		for(int i=0;i<limit;i++) {
//			
//			a.add(sc.nextInt());
//		}
//		sc.close();
//		
//		a.stream().filter(Testing::Prime).forEach(System.out::println);
//		
//	}
}
