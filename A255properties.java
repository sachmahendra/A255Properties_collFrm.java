import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.*;

public class A255properties{
public static void main(String[] args)throws Exception {

    Properties p = new Properties();
/* 
    p.setProperty("brand", "Dell");
    p.setProperty("processor", "17");
    p.setProperty("OS", "Windows10");
    p.setProperty("Model", "Latitude");

   // System.out.println(p);

  //  p.store(new FileOutputStream("/New folder (2)/My.txt2"),"Laptop"); // to store all the data in a file

    // we can also use a .XML file to store the same data as
     p.storeToXML(new FileOutputStream("MyData.xml"),"Laptop");

     */

     // WE CAN ALSO ACCESS THE DATA OF XML FILE BY USING FILEINPUTSTREAM AS BELOW
     p.loadFromXML(new FileInputStream("MyData.xml"));
     System.out.println(p);

   
}
}