import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest{


    public static void main(String[] args) {

        String toMatch = "Sachin Arora Amaira Arora Gunjan Arora Prem Lata Arora Shiv Kumar Arora";

        //Pattern pattern = Pattern.compile("Arora" , Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile("Arora" , Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(toMatch);
        //System.out.println(matcher.matches());

        System.out.println(toMatch.length());

        int count = 0;

        while(matcher.find()) {
            count++;
            System.out.println("Occurence" + count + " : " + matcher.start() + " to " + matcher.end() );
        }

        matcher.reset();

        while(matcher.lookingAt()) {
            count++;
            System.out.println("Occurence" + count + " : " + matcher.start() + " to " + matcher.end() );
        }


    }



}
