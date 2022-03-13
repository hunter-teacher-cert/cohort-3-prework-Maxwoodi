import java.util.*;

public class Crap
{
  public static int roll(int param)
  {
    int random = (int)(Math.random() * param + 1);

    return random;

  }

  public static int shoot(int numOfDice, int maxDiceVaule)
  {
    int total = 0;
    for(int i = 1; i <= numOfDice; i++)
      {
        total +=roll(maxDiceValue);
      }
  return total;
  }

  public static String round()
  { 
    int point1 = shoot(int numOfDice,int maxValue);
   if(point1 == 2 || point1==3||point1 == 12  )
   {
     return "Crap - you lost";
   }
   else ( point1==7 ||point1==11)
   {
     return "Natural - you won";
   }

    int point2 = shoot(int numOfDice, int maxVaalue);

    while( point2 != point1)
      {
       if(point == shoot(int numOfDice, int maxValue))
       {
         return " You win";
       }
        else (shoot(int numOfDice, int maxValue()))
          {
            return "You lose";
          }        
      }
  }
  public static void main(String [] args)
  {

   int numOfDice = 2;
   int maxValue = 12;
    for(int index = 0; index < Integer.parseInt(args); index++)
      {
       System.out.print("Round:" + " " + index + 1 + " " + " status:win or lose:" + " " + round());
        
      }
  }
}