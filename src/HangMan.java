/**
 * Created by pnegre on 04/04/16.
 */
public class HangMan {

    WordFactory wf;

    HangMan(WordFactory wf) {

        this.wf=wf;
    }

    public void play() {
        GameController gc = new GameController(
                new TextAlphabetDisplay(),
                new TextWordDisplay(),
                new TextGallows()
        );
        gc.playGame(this.wf.makeWord());

    }

    public static void main(String[] args) {
        WordFactory w = new DefaultWordFactory();
        HangMan h = new HangMan(w);
        h.play();

    }
}






