package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_Ex3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList number =new ArrayList();
		number.add(7);
		number.add(5);
		number.add(6);
		number.add("File1");
		number.add("File2");
		
		
		System.out.println("Number of element in arraylist:"+number.size());
		

	}

}
