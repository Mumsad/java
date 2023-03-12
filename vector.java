import java.util.*;
public class vector {

    public static void main(String[] args) {

        Vector <Integer> v = new Vector<Integer>(3,2);
        System.out.println("Intial size "+v.size());

        System.out.println("intial capacity "+v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Capacity after four addition "+v.capacity());
        v.addElement(5);

        System.out.println("Current Capacity is "+v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("Current Capacity is "+v.capacity());

       
        v.addElement(9);

        v.addElement(10);
        System.out.println("Current Capacity is "+v.capacity());

        v.addElement(11);
        v.addElement(12);

        System.out.println("First Elemnt: "+v.firstElement());
        System.out.println("Last Element: "+v.lastElement());

        if (v.contains(3))
 {
 System.out.println("Vectors contains 3.");
 }

 Enumeration <Integer> mum=v.elements();
 System.out.println("\nElement in vector");
 while(mum.hasMoreElements()){
    System.out.print(mum.nextElement()+" ");
 }
 System.out.println();


 



    }
}