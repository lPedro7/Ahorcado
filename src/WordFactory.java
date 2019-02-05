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
        return null;
    }
}