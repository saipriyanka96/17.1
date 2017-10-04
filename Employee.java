package emp;
//Package is a grouping of related types providing access protection and name

import java.io.Serializable;
//Serializible is a marker interface(has no data member and method)It is used to mark java classes
//that objects of thee classes may be get certain capability.
public class Employee implements Serializable
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//implements used for using the elements of  a java interface in your class 	  
{
   public String firstName;
   //String is a sequence a characters.
   //firstName is String
   public String lastName;
 //lastName is String
   private static final long serialVersionUID = 5462223600l;
   //a private member is only accessible within the same class as it is declared
   //static is used for memory management
   //final is used in several different contexts to define an entity that can only be assigned once
   //long is used to store 64 bit integer/ it reserved words which have specified meaning relevant to a complier
   //serialVersionUID is a static final field.We can assign any number of our choice to it. This is must in serialization
}