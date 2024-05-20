package wipro1;




import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class predicate {
	public static void main (String args[]) {		
		List<Integer> numLst = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);		
		System.out.println("Original list..");		
		System.out.println(numLst);		
		Predicate<Integer> pl = data -> data % 2 == 0;		
		List filteredList = numLst.stream(). filter(pl).collect(Collectors.toList());		
		System.out.println("\nFiltered List..");		System.out.println(filteredList);	}}				

		
