
import java.util.*;


class GFG {


	public static void main(String args[])
	{
		
		
		TreeMap<Integer, String> tm
			= new TreeMap<Integer, String>();

		tm.put(160, "Java Full Stack");
		tm.put(150, "Python Full Stack");
		tm.put(80, "UI Full Stack");


		
		for (Map.Entry mapElement : tm.entrySet()) {

			int key = (int)mapElement.getKey();

			String value = (String)mapElement.getValue();

			
			System.out.println(key + " : " + value);
		}
	}
}
