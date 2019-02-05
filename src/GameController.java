public class GameController {

    AlphabetDisplay ad;
    WordDisplay wd;
    Gallows g;

    GameController(AlphabetDisplay ad, WordDisplay wd, Gallows g) {
        this.ad=ad;
        this.wd=wd;
        this.g=g;
    }

    void playGame(Word w) {
        Alphabet a = new Alphabet();
        while(!this.g.isHung() && !w.isGuessed()){
            this.g.display();
            this.wd.display(w);
            this.ad.display(a);
        }
    }

    private char getInput() {
        return 0;
    }
}
