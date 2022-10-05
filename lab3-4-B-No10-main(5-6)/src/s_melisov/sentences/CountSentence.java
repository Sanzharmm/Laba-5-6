package s_melisov.sentences;

import s_melisov.interfaces.Countable;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountSentence implements Countable {
    @Override
    public int count(String path) {
        int countSentences = 0;
        char point = '.';
        try (Scanner input = new Scanner(new File(path))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == point)
                        countSentences++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Sentences - " + countSentences);
        return countSentences;
    }
}
