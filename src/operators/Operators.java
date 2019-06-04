/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author alexa
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Relational Operators
    /* >
<
>=
<=
==
!=
*/
   boolean a=2<3;
   System.out.println("a is"+a);
   boolean b=(2==3);
   System.out.println("a is"+b);
   //LOGICAL OPERATORS
   /*
   &&
   ||
   !
   */
   boolean x=true;
   boolean y= false;
   boolean z=(x&&y);
   System.out.println("z is+ "+z);
   
  
    boolean g=!z;
    System.out.println("g is"+g);
    int number =10;
    number +=5;
    System.out.println(number);
     int age=10;
     age++;
     System.out.println(age);
     int book=10;
     int newbook=++age+12*(book+book);
     System.out.println(book);
     
     System.out.println(newbook);
    }
    
}
