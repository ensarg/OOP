import java.util.Stack;

public class Main {

    public static boolean isHTMLMatched(String html) {
        Stack<String> buffer =  new Stack<>( );
        int j = html.indexOf('<'); // find first ’<’ character (if any)
        while (j != -1) {
            int k = html.indexOf('>', j+1); // find next ’>’ character
            if (k == -1)
            return false; // invalid tag
            String tag = html.substring(j+1, k); // strip away < >
            if (!tag.startsWith("/")) // this is an opening tag
            {buffer.push(tag);System.out.println("tag "+ tag +"\n"); }
            else { // this is a closing tag
                if (buffer.isEmpty( ))
                    return false; // no tag to match
                System.out.println("tag will be poped "+ buffer.peek() +"\n");
                if (!tag.substring(1).equals(buffer.pop( )))
                    return false; // mismatched tag
            }
            j = html.indexOf('<', k+1); // find next ’<’ character (if any)
        }
        return buffer.isEmpty( ); // were all opening tags matched?
    }


    public static void main(String[] args) {


        String html_example ="<body>\n" +
                "<center>\n" +
                "<h1> The Little Boat </h1>\n" +
                "</center>\n" +
                "<p> The storm tossed the little\n" +
                "boat like a cheap sneaker in an\n" +
                "old washing machine. The three\n" +
                "drunken fishermen were used to\n" +
                "such treatment, of course, but\n" +
                "not the tree salesman, who even as\n" +
                "a stowaway now felt that he\n" +
                "had overpaid for the voyage. </p>\n" +
                "<ol>\n" +
                "<li> Will the salesman die? </li>\n" +
                "<li> What color is the boat? </li>\n" +
                "<li> And what about Naomi? </li>\n" +
                "</ol>\n" +
                "</body>\n";

        boolean is_tag_mached = isHTMLMatched(html_example);

        System.out.println("is tag matched ? "+ is_tag_mached);
    }
}
