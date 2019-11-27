package List;

import java.util.HashSet;
import java.util.Iterator;

public class L2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set=new HashSet<String>();
		set.add("Adhithya");
		set.add("Janaki");
		set.add("Sajin");
		set.add("Jayasoorya");
		set.add("Bhanuja");
		set.add("Sajin");
		set.add("Jayasoorya");
		set.add("Aarya");
		set.add("Robin");
		set.add("Janaki");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
