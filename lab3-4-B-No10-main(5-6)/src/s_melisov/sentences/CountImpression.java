package s_melisov.sentences;

import s_melisov.interfaces.Countable;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class  CountImpression implements Countable {
    @Override
    public int count(String path) {
        int countImpressions = 0;
        char impression = '!';
        try (Scanner input = new Scanner(new File(path))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == impression)
                        countImpressions++;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Impressions - " + countImpressions);
        return countImpressions;
    }
}
