import java.util.BitSet;

public class A257BitSet {
    public static void main(String[] args) {
        
        BitSet bs1 = new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(8);

      //  System.out.println(bs1);

        BitSet bs2 = new BitSet();

        bs2.set(0);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(6);
        bs2.set(7);
        bs2.set(8);

        bs1.or(bs2); 

        System.out.println(bs1);  // it give union of bs1 with bs2  SAME FOR AND OPERATION
    }
}

/* 


//USING FLIP OPERATION

import java.util.BitSet;

public class A257BitSet {
    public static void main(String[] args) {
        
        BitSet bs1 = new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(8);

      //  System.out.println(bs1);

        BitSet bs2 = new BitSet();

        bs2.set(0);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(6);
        bs2.set(7);
        bs2.set(8);

        bs1.flip(0,bs1.length()); //IT WILL GIVE THE FLIP OF BS1
        System.out.println(bs1);

       
    }
}

*/