import java.util.*;

public class Array
{
 // Exercise 8.12.1 Part 1
 public static double [] powArray(double [] ray)
 {
   double [] squareRay = new double[ray.length];
   for( int index = 0; index < ray.length; index++)
   {
     squareRay[index] = Math.pow(ray[index], 2.0);
   }

   return squareRay;
 }

// Exercise 8.12.1 Part 2
  
  public static double [] powArray(double [] ray, double n)
 {
   double [] squareRay = new double[ray.length];
   for( int index = 0; index < ray.length; index++)
   {
     squareRay[index] = Math.pow(ray[index], n);
   }

   return squareRay;
 }

// Exercise 8.12.1 Part 2 A
  public static int [] histogram( int [] scores)
  {
   int [] counts = new int[scores.length];

    for(int i = 0; i < scores.length; i++)
      {
       int index = scores[i];
        counts[index]++;
      }
    return counts;
     
  }

  
 // Exercise 8.12.1 Part 2 B
 public static int [] histogram(int [] scores, int numCounter)
 {
    int [] counts = new int[numCounter];

   for(int i = 0; i < scores.length; i++)
   {
     int index = scores[i];
     counts[index]++;
   }
  return counts;

 }

  public static void main(String [] args)
  {
    // Exercise 8.12.1 Part 1
   double [] a = {1.0,2.0,3.0,4.0};

    double [] result = powArray(a);
   for(int j = 0; j < a.length; j++)
   {
   System.out.print( result[j] + " ");
   }
     // Exercise 8.12.1 Part 2
    double n = 3.0;
    double [] result2 = powArray(a,n);
for(int j = 0; j < a.length; j++)
   {
   System.out.print( result2[j] + " ");
   }
    

    // Exercise 8.12.1 Part 2

    int [] scores = new int[100];

    for(int index = 0; index < scores.length; index++)
      {
       scores[index] = index + 2;
        
      }

     // Exercise 8.12.1 Part 2 A

    int [] result3 = histogram(scores);
    for( int j = 0 ; j < result3.length; j++)
      {
        System.out.print( result3[j] + " ");
      }

    

     // Exercise 8.12.1 Part 2 B
    int numCounter = 100;
    int [] result4 = histogram(scores,numCounter );

    for(int j = 0; j < result4.length ; j++)
      {
       System.out.print(result4[j] + " ");
      }

      
  }
}