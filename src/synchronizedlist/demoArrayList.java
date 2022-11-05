package synchronizedlist;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class demoArrayList {
		public static void main (String[] args)
		{
			List<Integer> list =
			Collections.synchronizedList(new ArrayList<Integer>());

			list.add(1);
			list.add(2);
			list.add(3);

			synchronized(list)
			{
				// must be in synchronized block
				Iterator it = list.iterator();

				while (it.hasNext())
					System.out.println(it.next());
			}
			
			 // creating a thread-safe Arraylist.
	        
			//2nd method
			
			CopyOnWriteArrayList<String> threadSafeList
	            = new CopyOnWriteArrayList<String>();
	 
	        // Adding elements to synchronized ArrayList
	        threadSafeList.add("geek");
	        threadSafeList.add("code");
	        threadSafeList.add("practice");
	 
	        System.out.println("Elements of synchronized ArrayList :");
	 
	        // Iterating on the synchronized ArrayList using iterator.
	        Iterator<String> it = threadSafeList.iterator();
	 
	        while (it.hasNext())
	            System.out.println(it.next());
	    }
	

}
