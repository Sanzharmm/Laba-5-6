package s_melisov.words;

import s_melisov.interfaces.Countable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWord implements Countable {
    @Override
    public int count(String path) {
        File f1 = new File(path);                       //Creation of File Descriptor for input file
        String[] words = null;                          //Intialize the word Array
        int wc = 0;                                     //Intialize word count to zero

        try (FileReader fr = new FileReader(f1);        //Creation of File Reader object
             BufferedReader br = new BufferedReader(fr)) {   //Creation of BufferedReader object
            String s;
            while ((s = br.readLine()) != null)         //Reading Content from the file
            {
                words = s.split(" ");             //Split the word using space
                wc = wc + words.length;                 //increase the word count for each word
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of words in the file:" + wc);
        return wc;
    }
}
