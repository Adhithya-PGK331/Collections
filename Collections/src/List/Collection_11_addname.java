package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collection_11_addname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//asking for list size
		ArrayList list =new ArrayList();//Arraylist class declaration
		//ArrayList<String> list=new ArrayList();
		//<---Array declaration using datatype
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			list.add(name);//add method
		}
		Iterator itr=list.iterator();//to traverse an element one time
		while(itr.hasNext())//boolean hasNext() returns true if iteration doesnt ends
		{//ie it has more elements
			System.out.println(itr.next());//returns the next element
		}
	}
}