
package vectorexample;

import java.util.Enumeration;
import java.util.Vector;


public class VectorExample {

     static void display(Vector v)
{
  Enumeration e=v.elements();
  
  System.out.println("Elements in the vector are:");
       while (e.hasMoreElements())
       {
           System.out.println(e.nextElement());
       }
  
}
    public static void main(String[] args) {
       
        Vector v=new Vector();
        
        v.addElement(new Integer(4));
        v.addElement(new Double(5.999));
        v.addElement(new Character('A'));
        v.addElement(new Float(9.4F));
        
        display(v);
        
       
       v.insertElementAt(new Integer(6), 2);
       
       display(v);      
       
       v.remove(4);
       
       display(v);
       
       v.setElementAt(new String("Nikhil"), 3);
       
       display(v);
       
    }
}
