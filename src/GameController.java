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
        while(!this.g.isHung() && !w.isGuessed()){
            
        }
    }

    private char getInput() {
        return 0;
    }
}
