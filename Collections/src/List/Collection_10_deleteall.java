
package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collection_10_deleteall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner s=new Scanner(System.in);
		  System.out.println("First list :\n");
		    ArrayList<String>list=new ArrayList<String>();//for getting string datatyped list
		    list.add("Hai");//adding elements to the first list
		    list.add("Welcome");//adding next element
		    list.add("Face");//adding third element
		    Iterator itr=list.iterator();//iterating the list to print the values in the list
		     while(itr.hasNext())
		    {
		    	System.out.print(itr.next()+" ");//printing the list
		    }
		    System.out.print( "]");
		    list.clear();//to clear all elements in the array list
		    System.out.print("\nAfter clear ArrayList:[");
		    System.out.print( "]");
	}
			
}