import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    // Read file
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("README.md");
        BufferedReader br = new BufferedReader(fr);

        while (br.ready()) {
            System.out.println(br.readLine()); // read lines
        }
        
        // File closed after read
        FileReader fr2 = new FileReader("README.md");
        BufferedReader br2 = new BufferedReader(fr2);
        if (br2.ready()) {
            char c[] = new char[20];
            br2.read(c);                // read to array
            for (int i = 0; i < 20; i++) {
            System.out.print(c[i]); 
            }
        }
        
    }
}
