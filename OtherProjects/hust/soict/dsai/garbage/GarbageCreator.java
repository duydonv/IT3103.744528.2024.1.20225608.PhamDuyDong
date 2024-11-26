package OtherProjects.hust.soict.dsai.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Pham Duy Dong\\Downloads\\answer.txt"; // Replace with a large file path
        byte[] inputBytes = null;
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b; // Inefficient concatenation
            }
            endTime = System.currentTimeMillis();
            System.out.println("Pham Duy Dong - 5608 - Processing time (using +): " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


