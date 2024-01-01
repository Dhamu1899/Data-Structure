package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_Ex2 {

	public static void main(String[] args) {
		ArrayList <String> alist=new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		//display the element
		System.out.println(alist);
		
		alist.remove("Steve");
		alist.remove("Angela");
		//display the element
		System.out.println(alist);
		
		alist.remove(2);
		//display the element
		System.out.println(alist);
		
		for(String str:alist)
			System.out.println(str);
		
		System.out.println("Number of element in arraylist:"+alist.size());
		

	}

}
