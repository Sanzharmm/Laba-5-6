package s_melisov.chars;


import s_melisov.interfaces.Countable;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CountDot implements Countable {
    @Override
    public int count(String path) {
        int count = 0;
        char someChar = ',';

        try (Scanner input = new Scanner(new File(path))) {
            while (input.hasNextLine()) {
                String answer = input.nextLine();
                answer = answer.toLowerCase();
                for (int i = 0; i < answer.length(); i++) {
                    if (answer.charAt(i) == someChar) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(", - " + count);
        return count;

    }

}
