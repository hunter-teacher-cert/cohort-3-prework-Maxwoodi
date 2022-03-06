import java.util.*;

public class Array
{
 // Exercise 8.12.1 Part 1
 /*public static double [] powArray(double [] ray, double n)
 {
   for( int index = 0; index < ray.length; index++)
   {
     ray[index] = Math.pow(ray[index], n);
   }

   return ray;
 }*/

 // Exercise 8.12.1 Part 2
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
   /*double [] a = { 1,2,3,4};

   for(int j = 0; j < a.length; j++)
   {
   System.out.print( powArray(a, 2.0) + " ");
   }*/

  }
}