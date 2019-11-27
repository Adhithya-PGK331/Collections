package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Casestudy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of customers : ");//asking for list size
		int n=s.nextInt();
		ArrayList al =new ArrayList();//Arraylist class declaration
		int i=0;
		Customer[] cust=new Customer[n];
	for(i=0;i<n;i++)
	{//for looping the registration process for 'n' customers
	      System.out.println("Registration");
	    System.out.println("Enter your name");
	  String name=s.next();
	     System.out.println("Enter your address");
	   String  address=s.next();
	     System.out.println("Contact Number");
	 int  contact=s.nextInt();
	  System.out.println("E-Mail ID");
	  String   email=s.next();  
	     System.out.println("Enter proof type");
	   String  prooftype=s.next();  
	     System.out.println("Enter proof id");
	String proofid=s.next(); 
	 String email1="";// variable for updating new email
	  cust[i]=new Customer();
		cust[i].setName(name);
		cust[i].setAddress(address);
		cust[i].setContact(contact);
		cust[i].setEmail(email);
		cust[i].setProoftype(prooftype);
		cust[i].setProofid(proofid);
		al.add(cust[i]);//adding the details of customers to the list
	 System.out.println("Thank you for registering. Your id is 1...");
	
	    System.out.println("Do you want to update the email id?(y/n)");
	    String m=s.next();
	    String ye=m.toLowerCase();//for getting upper case or lowercase of y
	    // value denoting yes or n value denoting  no
	    if(ye.equals("y")==true) {
	    System.out.println("Update Email");		
	    System.out.println("Enter new Email id:");
	   
		email1=s.next();//reading new email
		cust[i].setEmail(email1);//email updating using set
	    System.out.println("Email updated");
	    	}
		}
	int d=0;
		System.out.println("\nDetails are as follows : ");
	    
	    Iterator itr=al.iterator();//to traverse an element one time
	   for(i=0;itr.hasNext();i++) {
		   d=i;d++;
			System.out.println("\n********************");
		   System.out.println("Customer details "+d);
			System.out.println("********************\n");

		
			Customer e=(Customer) itr.next();//validation purpose
			System.out.println("Name : "+e.getName()+"\n"+"Address : "+e.getAddress()+"\n"+"Contact : "+e.getContact()+"\n"+"Email : "+e.getEmail()+"\n"+"Prooftype : "+e.getProoftype()+"\n"+"Proofid : "+e.getProofid());	
			//printing the cutomer details
	   }
	   System.out.println("Do you want to delete any customer details ?(y/n)");
	    String b=s.next();
	    String di=b.toLowerCase();
	    if(di.equals("y")==true) {
	    	System.out.println("Id\tName");
	    	for(i=0;i<n;i++) {
	    	
	    	System.out.println(i+"\t"+cust[i].name);//printing the customer id and name for deletion purpose
	    	}
	    System.out.println("Enter the Customer id to perform deletion :");
	    int id=s.nextInt();// cutomer id for deleting customer having id as id value
	   al.remove(cust[id]);//email updating using set
	}
	    System.out.println("After deletion ");
	    Iterator it=al.iterator();//to traverse an element one time
	    for(i=0;it.hasNext();i++) {//traversing upto last cutomer
			   d=i;d++;
				System.out.println("\n********************");
			   System.out.println("Customer details "+d);
				System.out.println("********************\n");

			   
			
				Customer e=(Customer) it.next();//validation purpose
				System.out.println("Name : "+e.getName()+"\n"+"Address : "+e.getAddress()+"\n"+"Contact : "+e.getContact()+"\n"+"Email : "+e.getEmail()+"\n"+"Prooftype : "+e.getProoftype()+"\n"+"Proofid : "+e.getProofid());	
				//printing details of customer after deletion
		   }
}
}
