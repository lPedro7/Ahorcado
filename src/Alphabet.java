public class Alphabet {
    int[] ar = new int['z' - 'a' + 1];

    public boolean isUsed(char c) {
        int i = charToLower(c) - 'a';
        if (ar[i] == 0) {
            return false;
        }
        return true;
    }

    public boolean doGuess(char c) {
        if (this.isUsed(c)) return true;
        ar[charToLower(c) - 'a'] = 1;
        return false;
        }


    private char charToLower(char c) {
        if ('a' <= c && c <= 'z') return c;
        if ('A' <= c && c <= 'z') return (char) (c - 'A' + 'a');
        throw new RuntimeException();
    }


}

interface AlphabetDisplay {
    void display(Alphabet a);
}

class TextAlphabetDisplay implements AlphabetDisplay {
    public void display(Alphabet a) {
    }
}