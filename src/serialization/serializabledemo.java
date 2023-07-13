package serialization;

import java.io.*;

 class dog implements Serializable
{
   transient int i=10;
      int j=20;
}
public class serializabledemo
{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	   dog d=new dog();
	   FileOutputStream fs = new FileOutputStream("D:/abc.txt");
	    ObjectOutputStream os = new ObjectOutputStream(fs);
	    os.writeObject(d);

	   
	   FileInputStream fis = new FileInputStream("D:/abc.txt");
	   ObjectInputStream ois=new ObjectInputStream(fis);
	   dog d2=(dog)ois.readObject();
	    System.out.println(d2.i+" "+d2.j);
	    
	    
	    
	}
}
