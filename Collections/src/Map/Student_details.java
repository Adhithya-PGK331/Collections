package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Student_details {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no of students");
	int n=s.nextInt();
	Student[]stud=new Student[n];
	
	int i=0;int flag=0;
	Map<Integer,Student> map=new HashMap<Integer,Student>();
	for(i=0;i<n;i++)
	{
	
	stud[i]=new Student();
	System.out.println("Enter your name");
	String name=s.next();
	System.out.println("Enter your age");
	int age=s.nextInt();
	System.out.println("Enter your Register number");
	int regno=s.nextInt();
	System.out.println("Enter your Phone number");
	int phoneno=s.nextInt();
	System.out.println("Enter your College name");
	String cname=s.next();
	System.out.println("Enter your Address");
	String address=s.next();
	System.out.println("Enter your mark");
	int mark=s.nextInt();
	System.out.println("Enter your year");
	int year=s.nextInt();
	
	stud[i].setName(name);
	stud[i].setAge(age);
	stud[i].setRegno(regno);
	stud[i].setPhoneno(phoneno);
	stud[i].setCname(cname);
	stud[i].setAddress(address);
	stud[i].setMark(mark);
	stud[i].setYear(year);
	map.put(i, stud[i]);
	
	}
	System.out.println("Enter the key :\n");
	int k=s.nextInt();
	
for(Entry<Integer, Student> en:map.entrySet())
{
	flag=0;
	Student e=null;int key=0;
	for(i=0;i<n;i++) {
	key=en.getKey();
	e=en.getValue();
	key=e.getRegno();
	if(k==key) {
		flag=1;break;
	}
	else {
		flag=0;
	}
	}
	if(flag==1) {
	System.out.println(key+" "+e.getName()+" "+e.getAge()+" "+e.getRegno()+" "+e.getPhoneno()+" "+e.getCname()+" "+e.getAddress()+" "+e.getMark()+" "+e.getYear());
			}
		}
if(flag==0) {
	System.out.println("Invalid register number");
}
	}
}