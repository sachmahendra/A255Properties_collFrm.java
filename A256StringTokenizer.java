/* 

import java.util.StringTokenizer;

public class A256StringTokenizer {
    public static void main(String[] args) {
        
        String data = "name=Mahendra;adress=siddharthnager;country=India;dept=CSE";

        StringTokenizer stk = new StringTokenizer(data, "=;");  //HERE "=;" IS DELEMETER
        // WE CAN USE \n AT THE PLACE OF (;) IN LINE 6 ALSO AND CSN GIVE SPACE

        // IF WE GIVE SPACE IN LINE 6 ONLY AT THE PLACE OF (;) AND NOT GIVE IN LINE 8 AS DELEMETER THEN IT NOT FOLLOW TOCKENIZER

        String s;

        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}

*/

//NOW WE TRY TO TAKE DATA FROM ANY FILE

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class A256StringTokenizer {
    public static void main(String[] args) throws Exception{

        FileInputStream fis= new FileInputStream("My.txt2");
        byte b[]=new byte[fis.available()];

        fis.read(b);
        String data =new String(b);
        
       // String data = "name=Mahendra;adress=siddharthnager;country=India;dept=CSE";

        StringTokenizer stk = new StringTokenizer(data, "=;");  //HERE "=;" IS DELEMETER
        
        String s;

        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}