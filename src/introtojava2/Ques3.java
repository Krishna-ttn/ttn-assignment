package introtojava2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ques3 {
    public static void main(String[] args) {
        String filename = args[0];
        String word = args[1];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            //reading line by line
            while ((line = reader.readLine()) != null) {
                count += countOccurrences(line, word);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        System.out.println("The word \"" + word + "\" occurs " + count +
                " times in the file \"" + filename + "\".");
    }

    public static int countOccurrences(String line, String word) {
        int count = 0;
        int index = line.indexOf(word);

        // Loop until no more occurrences are found.
        while (index != -1) {
            count++;
            // Move past the current occurrence before searching again.
            index = line.indexOf(word, index + word.length());
        }
        return count;
    }
}
