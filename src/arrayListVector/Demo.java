package arrayListVector;


import java.io.*;
import java.util.*;

public class Demo {
	public static void main (String[] args)
    {
        // creating an ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        // adding object to arraylist
        al.add(1);
        al.add(1);
        al.add(3);
 
        // traversing elements using Iterator'
        System.out.println("ArrayList elements are:");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());
 
        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("Practice");
        v.addElement("quiz");
        v.addElement("code");
 
        // traversing elements using Enumeration
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
