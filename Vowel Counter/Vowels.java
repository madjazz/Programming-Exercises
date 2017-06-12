import java.util.Arrays;

public class Vowels {

   public static void main(String[] args) {

      String s = "jhfuhiuahiaho";
      int v_count = 0;

      for ( int i = 0; i < s.length(); i++ ) {

         char v = s.charAt(i);

         if ( Arrays.asList('a', 'e', 'i', 'o', 'u').contains(v) ) {

           v_count++;

         } else {

           v_count += 0;

         }
      }

      System.out.println("Number of vowels: " + v_count);
   }
}
