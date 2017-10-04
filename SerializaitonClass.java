package emp;
//Package is a grouping of related types providing access protection and name

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializaitonClass {
	//public keyword is used in the declaration of a class,method or 
	//field;public classes,method and fields can be accessed by the 
	//members of any class.
	//class defines instance and class fields,methods and inner classes as
	//well as specifying the interfaces the class implements and the 
	//immediate superclass of the class
  public static void main(String[] args) 
  //static is used for memory management
	//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
			
  {
    Employee emp = new Employee();
    //here creating the EmployeeClass object which implemented  the  serializable interface
    emp.firstName ="Priya";//first  and last name of the employee
    emp.lastName = "Naru";
  
    try {
    	/*the code is prone to exceptions is placed in the try block
    	 *when exception occurs that exception occurred is handled by the 
    	 *catch block associated with it
    	 */
      FileOutputStream fileOut = new FileOutputStream("D:/employee.txt");
      //creating an object of fileOut and assigning the path of text file
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(emp);//here we are passing the object of the employee
      out.close();//here closing the object output stream
      fileOut.close();// and here file of output stream
      System.out.println("Serialized data is saved in D:/employee.txt file");
      //gives the output as the  serialization file saved successfully
	  System.out.println("First Name:"+emp.firstName);
	  //gives the output as the  serialization file saved successfully
	  //displays the second name of the employee
      System.out.println("Last Name:"+emp.lastName);
      //system is final class
	      //out is a static member of system class and type printStream
	      //println is method of printStream class.ln means nextline
    } catch (IOException i)  {
      i.printStackTrace();//prints stack trace for this throwable object
    }
  }
}