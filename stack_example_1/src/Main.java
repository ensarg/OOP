
 import java.util.Stack;

public class Main {


    public static boolean isMatched(String expression) {
        final String opening = "({["; // opening delimiters
        final String closing = ")}]"; // respective closing delimiters
        Stack<Character> buffer = new Stack <>( );
        for (char c : expression.toCharArray( )) {
            if (opening.indexOf(c) != -1) // this is a left delimiter
            buffer.push(c);
            else if (closing.indexOf(c) != -1) { // this is a right delimiter
                if (buffer.isEmpty( )) // nothing to match with
                    return false;
                if (closing.indexOf(c) != opening.indexOf(buffer.pop( )))
                    return false; // mismatched delimiter
            }
        }
        return buffer.isEmpty( ); // were all opening delimiters matched?
    }

    public static void main(String[] args) {

        String parantez ="(  gfdkjshfkshdfl ) { fggkku }";
        boolean parantezler_dogru;
        parantezler_dogru = isMatched(parantez);
        System.out.println("parantezler doğru mu? " + parantezler_dogru );
    }
}
