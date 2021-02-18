
/*
Mini Project 1
Group#5: Jillian Sizemore, Daniel Hoevener, Myron Rankins, Noah Hornback
Date: 2/17/21
*/

import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Please enter any positive whole number: ");

    int userNum;
    userNum = s.nextInt();

    Random r = new Random();
    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated.");

    playGame(randomNum, userNum);

  }

  static void playGame(int theRandomNum, int theUserNum) {

    System.out.println("Please guess a number between 0 and " + theUserNum + ".");

    Scanner s = new Scanner(System.in);
    int userGuess;
    userGuess = s.nextInt();

    int numTries;
    numTries = 0;

    while (userGuess != theRandomNum) {
      if (userGuess > theRandomNum) {
        System.out.println("Guess lower!");
        System.out.println("Enter your new guess:");
        numTries++;
        userGuess = s.nextInt();
      } else if (userGuess < theRandomNum) {
        System.out.println("Guess higher!");
        System.out.println("Enter your new guess:");
        numTries++;
        userGuess = s.nextInt();
      }

    }
    if (userGuess == theRandomNum) {
      numTries++;
      System.out.println("Great, you win! It took you " + numTries + " tries.");
    }

  }
}