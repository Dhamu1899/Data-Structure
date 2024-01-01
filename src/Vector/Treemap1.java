package Vector;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Treemap1 {
//this is how to declare tree map
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<String,Integer>t=new TreeMap<String,Integer>();
//adding elements to treemap
t.put("roy",new Integer(90));
t.put("shelly",new Integer(80));
t.put("keats",new Integer(95));
t.put("charles",new Integer(38));
//display contents using iterator
Set s=t.entrySet();
Iterator i=s.iterator();
System.out.println("the following are the marks:");
System.out.println("names\t\tmarks");
while(i.hasNext()) {
	Map.Entry e=(Map.Entry)i.next();
	System.out.print(e.getKey()+ "\t\t"+e.getValue());
}
if(t.containsKey("roy"))
	System.out.println("map contains the entry 'roy'");
else
	System.out.println("map does not contaiins the entry 'roy'");
	t.put("macbeth",new Integer(58));
	i=s.iterator();
	System.out.println("the tree map after modification is");
	System.out.println("names\t\tmarks");
while(i.hasNext())
{
	Map.Entry e=(Map.Entry)i.next();
	System.out.println(e.getKey()+"\t\t"+e.getValue());
}
}
}
