
import java.util.*;

class LinkedHash {

	
	public static void main(String args[])
	{

		
		LinkedHashMap<Integer, String> hm
			= new LinkedHashMap<Integer, String>();

	
		hm.put(160, "Java Full Stack");
		hm.put(150, "Python Full Stack");
		hm.put(80, "UI Full Stack");

		
		for (Map.Entry<Integer, String> mapElement :
			hm.entrySet()) {

			Integer key = mapElement.getKey();

		
			String value = mapElement.getValue();

		
			System.out.println(key + " : " + value);
		}
	}
}
