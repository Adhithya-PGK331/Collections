package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collection_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");//asking for list size
		int n=sc.nextInt();
		ArrayList list =new ArrayList();//Arraylist class declaration
		//ArrayList<String> list=new ArrayList();
		//<---Array declaration using datatype
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Name ");
			String name=sc.next();
			System.out.println("Enter the age ");
			int age=sc.nextInt();
			list.add(name);//add method
			list.add(age);
		}
		System.out.println(list.get(0));//get method to get index[0]
		list.remove(0);//to remove the index value
		System.out.println(list.get(0));//get method to get index[0]
		Iterator itr=list.iterator();//to traverse an element one time
		while(itr.hasNext())//boolean hasNext() returns true if iteration doesnt ends
		{//ie it has more elements
			System.out.println(itr.next());//returns the next element
		}
	}
}