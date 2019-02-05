import java.util.Random;

public interface WordFactory {
    Word makeWord();
}

class DefaultWordFactory implements WordFactory {
    @Override
    public Word makeWord() {
        return new Word("TAULA");
    }
}


class DictWordFactory implements WordFactory {
    @Override
    public Word makeWord() {
        String[] words = new String[]{"ORDINADOR", "ESCOLA", "LICEU", "FOLI", "ROTULADOR", "PISSARRA"};
        Random r = new Random();
        return new Word(words[r.nextInt(words.length)]);
    }
}