package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;


public class Casestudy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();
		Scanner s=new Scanner(System.in);
		
		int cust[]=new int[25];
		String ac;
		String pr="";
		String cot;
		String cable;
		String wifi;
		String laundry;
		int total,b=0,c,d,e,f,i=1,j=1;int sta = 0;
		
		do {
			System.out.println("Menu");
		System.out.println("1.Book\n2.Check Status\n3.Exit");
		System.out.println("Enter your choice");
		int n=s.nextInt();
		Set1Booking[] booked=new Set1Booking[40];
		
switch(n) {
			case 1:
				
		System.out.println("Booking");
		System.out.println("Enter the number of customers ");
		
		
		System.out.println("Please choose the service required");
		System.out.println("AC/non-AC(AC/nAC)");
		ac=s.next();
		
		if(ac.contentEquals("AC")==true) {
			
			b=1500;}
		else {b=700;}
		
		System.out.println("Cot:Single/Double:(S/D)");
		cot=s.next();
		
		if(cot.contentEquals("S")==true) {c=50;}
		else {c=100;}
		
		System.out.println("Cable(C/nC)");
		cable=s.next();
		
		if(cable.contentEquals("C")==true) {d=50;}
		else {d=0;}
		
		System.out.println("Wifi(W/nW)");
		wifi=s.next();
		
		if(wifi.contentEquals("W")==true) {e=200;}
		else {e=0;}
		
		System.out.println("Laundry(L/nL)");
		laundry=s.next();
		
		if(laundry.contentEquals("L")==true) {f=100;}
		else {f=0;}
		
		booked[i]=new Set1Booking();
		booked[i].setAc(ac);
		booked[i].setCot(cot);
		booked[i].setCable(cable);
		booked[i].setWifi(wifi);
		booked[i].setLaundry(laundry);
		set.add(booked[i]);
		i++;
		
		total=b+c+d+e+f;
		
		System.out.println("The total charge is Rs."+total);
		System.out.println("The services chosen are");
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Set1Booking op=(Set1Booking)itr.next();
			System.out.println(itr.next()+"\n");
			System.out.println("AC\t:\t"+op.getAc());
			System.out.println("Cot\t:\t"+op.getCot());
			System.out.println("Cable\t:\t"+op.getCable());
			System.out.println("Wifi\t:\t"+op.getWifi());
			System.out.println("Laundry\t:\t"+op.getLaundry());
		}
		
		System.out.println("Do you want to proceed?(Y/N)");
		pr=s.next();
		if (pr.equals("Y")==true)
		{cust[j]=1;
		System.out.println("Thank you your room number is "+j);
		j=j+1;
		}
		break;
			case 2:
				System.out.println("Enter room number");	
				j=s.nextInt();
				if (cust[j]==1)
				{
					sta=1;
				System.out.println("Room "+j+" is booked");
				j=j+1;
				}
				else {sta=1;
				System.out.println("Room "+j+" is not booked");

				}
				break;
			case 3:	System.out.println("Exited successfully.Thank you..!!");
				return;
}	
	}while(pr.contentEquals("yes") || pr.contentEquals("no") || sta==1);
	}}

