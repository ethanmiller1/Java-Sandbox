import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    // Print text to console.
    System.out.println("What is your name?");

    // Get user input.
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    // Concatenate string with input and print to console.
    System.out.println("Hello " + name);
  }
  
}