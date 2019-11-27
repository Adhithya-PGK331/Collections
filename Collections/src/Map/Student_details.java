package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of students");
		int n=s.nextInt();
		Student[]stud=new Student[n];
		
		int i=0;
		Map<Integer,Employee> map=new HashMap<Integer,Employee>();
		for(i=0;i<n;i++)
		{
		
		stud[i]=new Student();
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter your age");
		int age=s.nextInt();
		System.out.println("Enter your Register number");
		int regno=s.nextInt();
		System.out.println("Enter your Phone number");
		int phoneno=s.nextInt();
		System.out.println("Enter your College name");
		int cname=s.nextInt();
		System.out.println("Enter your Address");
		int address=s.nextInt();
		System.out.println("Enter your mark");
		int mark=s.nextInt();
		System.out.println("Enter your year");
		int year=s.nextInt();
		map.put(i, stud[i]);
			}
		for(Map.Entry<Integer, Employee>en:map.entrySet())
		{
			int key=en.getKey();
			Employee e=en.getValue();
			System.out.println(key+" "+e.getName()+" "+e.getAge()+key+" "+e.getRegno()+" "key+" "+e.getPhoneno+" "+e.getCname+" "+e.getAddress+" "+e.getMark+" "+e.getYear);
			}
	}

}

class Student{
	
}