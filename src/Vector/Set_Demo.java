package Vector;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Demo {

	public static void main(String[] args) {
		int count[]= {34,22,10,60,30,22};
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<count.length;i++) {
			set.add(count[i]);
		}
		System.out.println(set);
		TreeSet<Integer>sortedSet=new TreeSet<Integer>(set);
		System.out.println("the sorted list is:");
		System.out.println(sortedSet);
		System.out.println("the first element of the setis:"+sortedSet.first());
		System.out.println("the last element of the set is:"+(Integer)sortedSet.last());
		
		
	}

}
