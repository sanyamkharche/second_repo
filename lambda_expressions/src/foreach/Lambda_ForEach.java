package foreach;

import java.util.ArrayList;
import java.util.List;

public class Lambda_ForEach {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("Sanyam");
		l.add("Vijay");
		l.add("Kushal");
		l.add("Chetan");
		
		/*for(String name:l)
		{
			System.out.println(name);   Normal approach
		}*/
		
		//Lambda approach
		l.forEach(
				(n)->
				System.out.println(n)
				);
	}
}
