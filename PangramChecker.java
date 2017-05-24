import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PangramChecker {

    public boolean isPangram(String input) {
        boolean msg = false;
        char[] characters = input.toLowerCase().toCharArray();
        ArrayList<Integer> chars = new ArrayList<Integer>();

        for(int c : characters) {
            if (c != ' ') {
                chars.add(c);
            }
        }
        /**Collections.sort(chars);  not necessery, but helps debugging
        System.out.println(chars);**/

        for(int i = 97; i <= 122; i++){
            if(chars.contains(i)){
                msg = true;
            } else {
                System.out.println("Breaked");
                msg = false;
                break;

            }
        }
        System.out.println("String is a pangram: " + msg);
        return msg;
    }



}
