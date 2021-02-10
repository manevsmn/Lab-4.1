/*
Lab 4
Partners: Martin Manevski and Myron Rankins
Date: 2/10/21
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
    
  Random r = new Random();
int randomNum = r.nextInt(50)+1;
  System.out.println("The Random number is: " + randomNum);
  
  if (randomNum <= 5)
  {System.out.println("Ahoy Mateys!");}
  else if(randomNum > 25 && randomNum < 42)
  {System.out.println("Cannonball!");}
  else
  {System.out.println("Blast off!");}
  while(randomNum >= 0)
    {
    System.out.println(randomNum);
    randomNum --;
  }}
}