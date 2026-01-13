import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        String str="Java自从95年问世以来,经历了很多版本,Java11和Java12都很好";

        methods1(str);
    }

    private static void methods1(String str) {
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
