package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Collection_8_array_encapsulation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter the size ");//asking for list size
		int n=sc.nextInt();
		ArrayList al =new ArrayList();//Arraylist class declaration
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Name ");
			String name=sc.next();
			System.out.println("Enter the age ");
			int age=sc.nextInt();
			System.out.println("Enter the Department ");
			String dept=sc.next();
			System.out.println("Enter the salary ");
			int salary=sc.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			emp[i].setDept(dept);
			emp[i].setSalary(salary);
			al.add(emp[i]);
		}
		
		System.out.println("\n********************************* ");
		System.out.println("Employee details are as follows : ");
		System.out.println("********************************* \n");

		Iterator <Employee> itr=al.iterator();//to traverse an element one time
		while(itr.hasNext())//boolean hasNext() returns true if iteration doesnt ends
		{//ie it has more elements
			Employee e=itr.next();//validation purpose
			System.out.println(e.getName()+" "+e.getAge()+" "+e.getDept()+" "+e.getSalary());
		}
	}
}
class Employee{
	String name;
	int age;
	String dept;int salary;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	}