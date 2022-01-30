import java.util.*;
import java.util.Map.Entry;
public class Genericmap {
public static void main(String[] args){
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(160, "Java Full Stack");
	map.put(150, "Python Full Stack");
	map.put(80, "UI Full Stack");


	//adding key, value pairs to the Map

	//using for-each loop
	for(Integer key : map.keySet()) {
	    String value = map.get(key);
	    System.out.println("" + key + ":" + value);
	}

	for(String value : map.values()) {
	    System.out.println(value);
	}
}
}