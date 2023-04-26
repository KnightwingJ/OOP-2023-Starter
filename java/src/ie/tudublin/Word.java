package ie.tudublin;

import java.util.ArrayList;

public class Word{
    private String word;

    ArrayList<Follow>follows = new ArrayList<Follow>();

    public Word(String word, ArrayList<Follow> follows) {
        this.word = word;
        this.follows = follows;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getWords() {
        return follows;
    }

    public void setWords(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    @Override
    public String toString() {
        return "Word [word=" + word + ", follows=" + follows + "]";
    }

    public void findFollow(String str){
        //String word=findWord(str);
        DANI s=new DANI();
        s.findWord(str);
        
    }
}
