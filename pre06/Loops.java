import java.util.*;

public class Loops
{
  //Chapter 7.9 Exercise # 2

 public static double squareRoot(double a)
  {
   double x0 = a/2.0;
   double  x1= 0.0;
   double x2 = 0.0;

   while (Math.abs(x0 - x2) < 0.0001)
   {
     
     x1 = (x0 + a/x0)/2;
     x2 = x0;
     x0 = x1;
   
    }
     return x1;
  }
 
  //Chapter 7.9 Exercise # 3

/*public static double power(double x, int n)
 {
   double product = 1;

   
    
    
    for(int index = 1; index <= n ; index++)
    {
      
      product =product * x;

    }
     return product;
    

   
   
 }*/

  //Chapter 7.9 Exercise # 4
 /* public static int factorial(int num)
  {
     int fact= num; 
    if(num == 0)
    {
      return 1;
    }
    else 
    {
      for(int index = 1; index < num; index++)
      {
        fact = fact *(num-index);

      }
      return fact;

    }

  }*/

  public static void main(String [] args)
  {
    double a = 36.0;
   System.out.print(" Square root of:" + " " + a + " " + "is"+ " " + squareRoot(a));

   //System.out.print(power(2.0,6));

  // System.out.print(factorial(3));

  }

}