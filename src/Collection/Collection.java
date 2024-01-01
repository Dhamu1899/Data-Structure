package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// List
		
		List <String> list=new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Tech Mahindra");
		list.add(2,"Zoho");
		//Collections.sort(list);
		list.forEach(System.out::println);

	}

}