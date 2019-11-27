package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collection_9_addlist {

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
		    {//printing the list before adding elements
		    	System.out.println(itr.next());
		    }
		    System.out.println("\nNew list :\n");
		    ArrayList<String>list1=new ArrayList<String>();//for getting string datatyped list
		    list1.add("Java");//adding elements to the second list
		    list1.add("Program");
		    list.addAll(list1);//adding the two lists
		    Iterator itr1=list.iterator();//iterating the list to print the values in the list
		    while(itr1.hasNext())//for iterating upto last element
		    {
		    	System.out.println(itr1.next());//printing the list after adding
		    }
		    
	}

}
