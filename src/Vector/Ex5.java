package Vector;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]A= {22,45,33,66,55,34,77};
		Integer[]B= {33,2,83,45,3,12,55};
		Set<Integer>set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer>set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		//finding union
		Set<Integer>union_data=new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.println("Union of set and set2 is:");
		System.out.println(union_data);
//finding intersection
		Set<Integer>intersection_data=new HashSet<Integer>(set1);
		intersection_data.retainAll(set2);
		System.out.println("Intersection of set and set2 is:");
		System.out.println(intersection_data);
		//finding dfference
		Set<Integer>difference_data=new HashSet<Integer>(set1);
		difference_data.removeAll(set2);
		System.out.println("Difference of set and set2 is:");
		System.out.println(difference_data);
	}
}