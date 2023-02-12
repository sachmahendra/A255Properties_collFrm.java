import java.util.*;
public class A258ArraysAndComparator {
    public static void main(String[] args) {
        
        int a[]={2,4,6,8,1,3,5,7};
        int b[]={2,4,6,8,1,3,5,7};

    //  int b[]={2,4,6,8,1,3,5};  // compare this and a[] will give (1) as o/p becz a has more element then b

    //  int b[]={2,4,6,8,1,3,5,7,9};  // compare this and a[] will give (-1) as o/p becz b has more element then a

       // System.out.println("1 :"+Arrays.compare(a, b));

       int c[] = Arrays.copyOf(a,a.length); //USE TO COPY THE 4 ELEMENT OF ARRAY a

      Arrays.sort(c);  //it is use to sort the ele of c which is copy of array a

    //   for(int x:c){
   //     System.out.println(x);
   //    }

   // c is a sorted array now so we can apply binary search also on this
    
   System.out.println(Arrays.binarySearch(c, 4));
   

    }
}


