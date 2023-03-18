package sream;
import java.io.*;  
public class DeSerializable {

 public static void main(String args[]){  
  try{  
  //Creating stream to read the object  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D://Student.txt"));  
  Student s=(Student)in.readObject();  
  //printing the data of the serialized object  
  System.out.println(s.id+" "+s.name);  
  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  