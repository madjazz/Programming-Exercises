import java.util.HashMap;
import java.util.ArrayList;

public class SubstringAlphOrder {

   public static void main(String[] args) {

        String s = "jhfuhiuahiaho";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 0);
        map.put("b", 1);
        map.put("c", 2);
        map.put("d", 3);
        map.put("e", 4);
        map.put("f", 5);
        map.put("g", 6);
        map.put("h", 7);
        map.put("i", 8);
        map.put("j", 9);
        map.put("k", 10);
        map.put("l", 11);
        map.put("m", 12);
        map.put("n", 13);
        map.put("o", 14);
        map.put("p", 15);
        map.put("q", 16);
        map.put("r", 17);
        map.put("s", 18);
        map.put("t", 19);
        map.put("u", 20);
        map.put("v", 21);
        map.put("w", 22);
        map.put("x", 23);
        map.put("y", 24);
        map.put("z", 25);

        String p = "";
        ArrayList<String> seq = new ArrayList<String>();

        for ( int i = 0; i < s.length(); i++ ) {

            p = p.concat(s.substring(i));

            if (p.length() > 1 && map.get(p.substring(p.length() - 1)) > map.get(p.substring(p.length() - 2)) ) {

              seq.add(p);
            }
            else if ( p.length() > 1 && map.get(p.substring(p.length() - 1)) == map.get(p.substring(p.length() - 2)) ) {

              seq.add(p);
            }
            else if ( p.length() > 1 && map.get(p.substring(p.length() - 1)) < map.get(p.substring(p.length() - 2)) ) {

              p = p.substring(p.length() - 1);
            }
            else if ( p.length() == 1 && map.get(p.charAt(i)) == 26 ) {

              seq.add(p);
            }
            else {

              continue;
            }
        }
        System.out.println(p);
   }
}
