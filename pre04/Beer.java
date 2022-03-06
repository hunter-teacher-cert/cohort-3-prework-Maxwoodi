import java.util.*;

public class Beer
{

public static void firstVerse()
{
 System.out.println("99 bottles of beer on the wall,");
 System.out.println("99 bottles of beer,");
 System.out.println("ya' take one down, ya' pass it around,");
 System.out.println("98 bottles of beer on the wall,");
 
 }

public static void lastVerse()
{
  System.out.println("No bottles of beer on the wall,");
 System.out.println("no bottles of beer,");
 System.out.println("ya\' can't take one down, ya\' can't pass it around,");
 System.out.println("\'cause there are no more bottles of beer on the wall!");

}

/*
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    int recurse = factorial(n - 1);
    int result = n * recurse;
    return result;
}

public static void countdown(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
}*/
public static void main(String [] args)
{
System.out.println("99 Bottles of Beer");
System.out.println();

 firstVerse();
System.out.println();
System.out.println();
 lastVerse();






}




}