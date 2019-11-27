package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class L1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of customers : ");//asking for list size
		int n=s.nextInt();
		LinkedList list =new LinkedList();//Arraylist class declaration
		int i=0;
		Custmr[] cust=new Custmr[n];
	for(i=0;i<n;i++)
	{
	    System.out.println("Enter your name");
	  String name=s.next();
	     System.out.println("Enter your address");
	   String  address=s.next();
	     System.out.println("Contact Number");
	 int  contact=s.nextInt();
	  
	     System.out.println("Enter proof id");
	String proofid=s.next(); 
	 String email1="";// variable for updating new email
		  cust[i]=new Custmr();
			cust[i].setName(name);
			cust[i].setAddress(address);
			cust[i].setContact(contact);
			cust[i].setProofid(proofid);
			list.add(cust[i]);//adding the details of Custmrs to the list
		 System.out.println("Thank you for registering. Your id is 1...");
	}
		int d=0;
			System.out.println("\nDetails are as follows : ");
		    
			System.out.println("\nNumber of Customers : "+list.size());
		    Iterator itr=list.iterator();//to traverse an element one time
		   for(i=0;itr.hasNext();i++) {
			   d=i;d++;
				System.out.println("\n********************");
			   System.out.println("Customer details "+d);
				System.out.println("********************\n");

			
				Custmr e=(Custmr) itr.next();//vaidation purpose
				System.out.println("Name : "+e.getName()+"\n"+"Address : "+e.getAddress()+"\n"+"Contact : "+e.getContact()+"\n"+"Proofid : "+e.getProofid());	
				//printing the cutomer details
		   }
	}
	}

class Custmr {
	String name;
	String address;
	int contact;
	
	String proofid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public String getProofid() {
		return proofid;
	}
	public void setProofid(String proofid) {
		this.proofid = proofid;
	}

}

