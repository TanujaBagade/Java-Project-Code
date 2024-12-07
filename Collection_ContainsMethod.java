package javabasics;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_ContainsMethod {

	public static void main(String[] args)
	{
		Collection c1=new ArrayList();
		c1.add("America");
		c1.add("123");
		c1.add("12.56");
		c1.add("True");
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("Parrot");
		c2.add("Tiger");
		System.out.println(c2);
		//Contains
		System.out.println(c1.contains("India"));
		//ContainsAll
		System.out.println(c2.containsAll(c1));
		//Remove
		System.out.println(c1.remove("123"));
		System.out.println(c1);
		//RemoveAll
		System.out.println(c2.removeAll(c1));
		System.out.println(c2);
		//Size
		System.out.println(c1);
		System.out.println(c1.size());
	}

}
