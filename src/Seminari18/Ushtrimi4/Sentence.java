package Seminari18.Ushtrimi4;

public class Sentence {
    private String phrase;

    public Sentence (String aPhrase) {
        phrase = aPhrase;
    }

    public boolean find(String text) {
        return find_helper(text, 0);
    }

    private boolean find_helper(String text, int index) {
        if (index > phrase.length() - text.length() + 1) return false;

        if (phrase.substring(index).startsWith(text)) return true;

        return find_helper(text, index + 1);
    }
}


// blahblahblah l:12
// blah l:4
// 12 - 4 = 8