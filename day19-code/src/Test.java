import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        File file = new File("day19-code\\a.txt");

        try {
            FileReader fr = new FileReader(file);
            char[] chars = new char[(int)file.length()];
            fr.read(chars);
            System.out.println(new String(chars));
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
