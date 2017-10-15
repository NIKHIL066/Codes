
package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class CollectionDemo 
{
   

    public static void main(String[] args) 
    {
  
        ArrayList l0=new ArrayList();        //array list

        
        l0.add("Nikhil");               //adding elements to the arraylist
        l0.add("Anarghya");
        l0.add("Mahesh");
        l0.add("Kartik");

        System.out.println("Elements are: "+l0);
        
        LinkedList l1;         //linked list
        l1 = new LinkedList();
         
         l1.add("Nikhil");              //adding elements to the linked list
         l1.add("Mahesh");
         l1.add("Anarghya");
         l1.add("Abhishek");
         
         List l2=new LinkedList();
         l2.addAll(l1);                 //adding elements of one linked list to another
        
         if(l2.containsAll(l1))         //check whether l2 has l1
         {
             System.out.println("L2 is same as L1");
         }
         else
         {
             System.out.println("L2 is different from L1");
         }
         
         System.out.println("Elements of 1st list are : "+l1+"\n Elements of second list are:"+l2);
         
         l2.clear();                    //clear all the elements of l2 
         
         if(l2.isEmpty())               //check l2 is empty or not
         {
             System.out.println("L2 is empty");
         }
         else
         {
             System.out.println("L2 is not empty");
         }
         
         
         l2.add("SDMCET");      //add elements of different types
         l2.add(1234);
         l2.add(3.1412f);
         l2.add('y');

         System.out.println("Elements are : "+l2);
         System.out.println("Size of collection : "+l2.size());
         
         if(l2.contains("SDMCET"))         //check whether l2 has SDMCET
         {
             System.out.println("L2 has SDMCET");
         }
         else
         {
             System.out.println("L2 doesnot have SDMCET");
         }
         
         l2.set(l2.indexOf("SDMCET"),"BVBCET");                           //set
         
         System.out.println("Elements of new list array : "+l2);
         l2.remove(l2.indexOf("BVBCET"));
            System.out.println("Elements of new list array : "+l2);
         l2.remove(l2.indexOf(1234));                                       //remove
         System.out.println("Elements of new list array : "+l2);
         
         float f1=(float)l2.get(l2.indexOf(3.1412f));                   //get
         System.out.println("->"+f1);
         
         Iterator it=l2.iterator();                                     //iterator
         
         System.out.println("\n");
         while(it.hasNext())
         {
             System.out.println(it.next());
         }
        return;
    }
    
}
