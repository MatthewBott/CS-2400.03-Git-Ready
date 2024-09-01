import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    int num;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter an integer between 1 & 10: ");
    num = keyboard.nextInt();
    System.out.println("The number you entered is " + num);

    keyboard.nextLine();

    String name;
    System.out.print("Enter your first name: ");
    name = keyboard.nextLine();
    System.out.println("Your name is " + name);
  }
}