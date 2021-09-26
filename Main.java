/* 
Mini Project 1
Group #6: Carson Hurst, Ayaan Ajmal, CalLind Gilson, Mahathi Venkatesh
Date:
*/

import java.util.Scanner;
import java.util.Random;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Please enter in any positive whole number: ");
    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);
    System.out.println("A random number to guess has been generated");
    playGame(randomNum, userNum);
  }

  public static int playGame(int guessNum, int originalNum)
  {
    System.out.println("Please guess a number between 0 and " + originalNum);
    Scanner s = new Scanner(System.in);
    int userGuess = s.nextInt();
    int numTries = 1;

    while(userGuess != guessNum)
    {
      if(userGuess > guessNum)
      {
      System.out.println("Guess lower!");
      }

      else if (userGuess < guessNum)
      {
        System.out.println("Guess higher!");
      }

      System.out.println("Enter your new guess: ");
      userGuess = s.nextInt();
      numTries++;
    }

    if (userGuess == guessNum)
      {
      System.out.println("Great you win! It took you "  + numTries + " tries to guess the number correctly.");
      }
    return guessNum;
  }
}