package OtherProjects.hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Pham Duy Dong\\Downloads\\answer.txt"; // Replace with a large file path
        byte[] inputBytes = null; // Declare and initialize the variable
        long startTime, endTime;

        try {
            // Read all bytes from the file into inputBytes
            inputBytes = Files.readAllBytes(Paths.get(filename));
            
            startTime = System.currentTimeMillis();
            
            // Use StringBuilder for efficient concatenation
            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char) b);
            }
            
            endTime = System.currentTimeMillis();
            
            System.out.println("Pham Duy Dong - 5608 - Processing time (using StringBuilder): " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }
}
