package udacity.guessGame;

import java.util.Scanner;

public class GuessGame {
  private int target = 0;
  static boolean hitTarget = false;

  public int getTarget() {
    this.target = (int)(Math.random() * 100);
    return target;
  }

  public static void main(String[] args) {
    GuessGame newGame = new GuessGame();
    int number = newGame.getTarget();
    System.out.println("I have randomly chosen a number between 0 and 100, try to guess it!");
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < 10; i++) {
      System.out.println("You have " + (10 - i) + " times left to guess number");
      int userNumber = input.nextInt();
      if (userNumber == number) {
        hitTarget = true;
        break;
      } else if (userNumber < number) {
        System.out.println("Your guess " + userNumber + " is less than the target");
      } else {
        System.out.println("Your guess " + userNumber + " is larger than the target");
      }
    }

    if(hitTarget) {
      System.out.println("You win the game! The target is " + number);
    } else {
      System.out.println("You lose the game! The target is " + number);
    }
  }
}
