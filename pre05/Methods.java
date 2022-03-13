import java.util.*;

public class Methods
{
/* Chapter 6.11 Exercise 2
Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.*/

public static boolean isDivisible(int n,int m)
{
  if( n % m == 0)
  {
    return true;
  }
  else 
  {
    return false;
  }

}

// Chapter 6.11 Exercise 3
public static boolean isTriangle(int stickA, int stickB, int stickC)
{
  if(((stickA + stickB) < stickC) || ((stickA + stickC) < stickB) ||((stickB + stickC) < stickA))
  {
    return false;
  }
    else 
  {
    return true;
  }


}

// Chapter 6.11 Exercise 8

public static int ack(int m, int n)
{
  
     if( m == 0)
     {
       int result = n + 1;
      return result;
     }
      else if( m > 0 && n == 0)
     {
       int result = ack(m-1,1);
      return result;
     }
     else //if(m > 0 && n > 0 )
    { 
      int recurse1= ack(m, n-1);
      int recurse2= ack(m-1, recurse1);
      int result = ack(ack(m-1),ack(m,n-1));
      //int result = recurse2;
       return result;
     }
     
  

}


public static void main(String [] args)
{
  // Is n divisible by m ?
int n = 12;
int m = 3; 
System.out.print( " Is" + " " + n + " " + "divisible by" + "" + m + " " + isDivisible(n, m));

// Is Triangle
int stickA = 1;
int stickB = 12;
int stickC = 1;

System.out.print(" Does a, b, and c represent the side lengths of a triangle?" + isTriangle(stickA,stickB,stickC));
}

// Ackerman Recursive Function

int m = 2;
int n = 1;

System.out.print(ack(m,n));
}
}