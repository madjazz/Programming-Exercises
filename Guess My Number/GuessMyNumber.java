import java.util.Scanner;

public class GuessMyNumber {

   public static void main(String[] args) {

      Scanner reader = new Scanner(System.in);

      int low = 0;
      int mid = 50;
      int high = 100;

      String guess = "Is your secret number: ";

      System.out.println("Please think of a number between 0 and 100!");
      System.out.println(guess + mid + "?");

      System.out.println("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. ");
      char request = reader.next().charAt(0);

      while ( request != 'c') {

          if ( request == 'h') {

            high = mid;
            mid = (mid + low) / 2;
          }
          else if ( request == 'l' ) {

            low = mid;
            mid = (mid + high) / 2;
          }
          else {

            System.out.println("Sorry, I did not understand your input.");
          }

          System.out.println(guess + mid + "?");
          System.out.println("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. ");
          request = reader.next().charAt(0);
      }

      if ( request == 'c' ) {

        System.out.println("Game over. Your secret number was: " + mid);
      }
   }
}
