package Vector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String>hmap = new HashMap<Integer,String>();//this is how to declare hashmap
//Adding elements to hashmap
hmap.put(12, "Chaitanya");
hmap.put(2, "rahul");
hmap.put(7, "singh");
hmap.put(49, "ajeeth");
hmap.put(3, "anuj");
	
	Set set=hmap.entrySet();
	Iterator iterator=set.iterator();
	while(iterator.hasNext()) {
		Map.Entry mentry=(Map.Entry)iterator.next();
		System.out.print("key is:"+ mentry.getKey()+"& Value is:");
	System.out.println(mentry.getValue());
	}
	//get values based on key
	String var=hmap.get(2);
	System.out.println("Value at index 2 is:"+var);
	//remove based on keys
	hmap.remove(3);
	System.out.println("Map key and values after removal:");
	Set set2=hmap.entrySet();
			Iterator iterator2=set2.iterator();
	while(iterator2.hasNext()) {
		Map.Entry mentry2=(Map.Entry)iterator2.next();
		System.out.print("key is:"+ mentry2.getKey()+"& Value is:");
	System.out.println(mentry2.getValue());
	}
	}
}