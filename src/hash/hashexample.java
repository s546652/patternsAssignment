package hash;

import java.util.*;
import java.lang.*;
import java.io.*;

// Name of the class has to be "Main"
// only if the class is public
class hashexample
{
	public static void main(String args[])
	{
		//----------hashtable -------------------------
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101," ajay");
		ht.put(101,"Vijay");
		ht.put(102,"Ravi");
		ht.put(103,"Rahul");
		System.out.println("-------------Hash table--------------");
		for (Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//ht.put(null, null);

		//----------------hashmap--------------------------------
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100,"Amit");
		hm.put(104,"Amit");
		hm.put(101,"Vijay");
		hm.put(102,"Rahul");
		System.out.println("-----------Hash map-----------");
		
		hm.put(null, null);
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
