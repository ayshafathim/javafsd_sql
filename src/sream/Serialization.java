package sream;
import java.io.*; 
public class Serialization {
	      
	 public static void main(String args[]){    
	  try{    
	  //Creating the object    
	  Student s1 =new Student(211,"ravi");    
	  //Creating stream and writing the object    
	  FileOutputStream Systemout=new FileOutputStream("D://Student.txt");    
	  ObjectOutputStream out=new ObjectOutputStream(Systemout);    
	  out.writeObject(s1);    
	  out.flush();    
	  //closing the stream    
	  out.close();    
	  System.out.println("success");    
	  }catch(Exception e){System.out.println(e);}    
	 }    
	}
	


