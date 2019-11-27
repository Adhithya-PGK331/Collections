package List;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection_13 {

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
			
			ArrayList list1 =(ArrayList) list.clone();//Arraylistcloning
			
	    int n2=sc.nextInt();
	    for(int i=0;i<n2;i++)
			{
				String name=sc.next();
				list1.add(name);//add method
			}
   		System.out.print(list);
   		System.out.println();
	    System.out.print(list1);
	  }
	}