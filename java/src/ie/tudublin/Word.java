package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;

    ArrayList<Follow>words = new ArrayList<Follow>();

    public Word(String word, ArrayList<Follow> words) {
        this.word = word;
        this.words = words;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getWords() {
        return words;
    }

    public void setWords(ArrayList<Follow> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Word [word=" + word + ", words=" + words + "]";
    }

    
}
