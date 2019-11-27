package List;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Casestudy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Set<NewCard> s=new TreeSet<NewCard>(new Symbol());
		NewCard[] c=new NewCard[40];
		int count=0;
		System.out.println("Enter the limit");
		int n=sc.nextInt();int i=0;int d=0;
		
		while(s.size()<n)
		{
			String symbol=sc.next();
		int num=sc.nextInt();
		c[count]=new NewCard();
		c[count].setSymbol(symbol);
		c[count].setNum(num);
		s.add(c[count]);
		count++;
		}
		Iterator itr=s.iterator();
		System.out.println(n+" symbols gathered in "+count+" cards");
		System.out.println("Cards are \n ");
		while(itr.hasNext())
		{
			NewCard ca=(NewCard)itr.next();
			System.out.println(ca.getSymbol()+" "+ca.getNum());
		}
	}

}
