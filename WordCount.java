import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class WordCount {
    public static void main(String[] args) throws Exception {
        String path = "text.txt";
        int charCount = 0;
        int wordCount = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path));
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (bufferedReader.read() != -1) {
            String s = bufferedReader.readLine();
            System.out.println(s);
            charCount += s.length();
            String[] s1 = s.split(" ");
            for (String s2 : s1) {
                String[] s3 = s2.split(",");
                wordCount += s3.length;
            }
        }
        inputStreamReader.close();
        bufferedReader.close();
        for (String flag : args) {
            switch (flag) {
                case "-c":
                    System.out.println(charCount);
                    break;
                case "-w":
                    System.out.println(wordCount);
                    break;
            }
        }
    }
}
