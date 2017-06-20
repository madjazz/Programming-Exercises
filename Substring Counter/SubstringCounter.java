public class SubstringCounter {

   public static void main(String[] args) {

     String s = "jhfuhiuahiahobobob";
     String subString = "bob";

     int lastIndex = 0;
     int count = 0;

     while( lastIndex != -1 ) {

         lastIndex = s.indexOf(subString, lastIndex);

         if( lastIndex != -1 ) {
             count ++;
             lastIndex += subString.length();
         }
     }
     System.out.println(count);
   }
}
