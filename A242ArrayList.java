import java.util.*;

public class A242ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));
        al1.add(10);     //USED METHOD ON ARRAYLIST
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5, 70);

        System.out.println("1 :"+al1.contains(30)); //USE TO CHECK THAT ELEMENT PRESENT IN THE LIST OR NOT

        System.out.println("2 :"+al1); //USE TO PRINT ALL ELE
        System.out.println("3 :"+al1.get(5)); //TO CHECK THE ELEMENT AT THE GIVEN INDEX

        System.out.println("4 :"+al1.indexOf(70)); //IT WILL GIVE THE INDEX OF 70 which comes first in array

        System.out.println("5 :"+al1.lastIndexOf(70)); // it will give the index of 70 which comes in last

        System.out.println("6 :"+al1.set(6, 100));
        System.out.println(al1);
    }
        
    }

