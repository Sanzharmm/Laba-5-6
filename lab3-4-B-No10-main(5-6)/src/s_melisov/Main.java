package s_melisov;

import s_melisov.chars.CountDot;
import s_melisov.chars.CountH;
import s_melisov.chars.CountQuote;
import s_melisov.interfaces.Countable;
import s_melisov.interfaces.Searchable;
import s_melisov.sentences.CountImpression;
import s_melisov.sentences.CountQuestion;
import s_melisov.sentences.CountSentence;
import s_melisov.words.CommonWordFinder;
import s_melisov.words.CountWord;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Countable> counters = getCountClasses();
        Searchable searcher = new CommonWordFinder();

        searcher.find("text.txt");
        counters.forEach(countable -> countable.count("text.txt"));
    }
    
    private static List<Countable> getCountClasses() {
        return List.of(
                new CountDot(), new CountH(), new CountQuote(), new CountWord(),
                new CountSentence(), new CountQuestion(), new CountImpression()
        );
    }
}
