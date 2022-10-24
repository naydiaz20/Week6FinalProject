import java.util.ArrayList;
import java.util.List;

public class Player {

    public List<Card> hand = new ArrayList<Card>();

    private int score = 0;
    private String name;
    public Player (String name) {
        SetScore(0);
        this.name=name;
    }
    private void SetScore(int i) {
        score = i;

    }
    public Card flip() {
        return hand.remove(0);
    }
    public void draw(Deck ofCards) {
        hand.add(ofCards.draw());
    }
    public int handsSize() {
        return hand.size();

    }

    public void incrementScore() {
        this.score += 1;
    }
    public int getScore() {
        return score;

    }
    public void describe() {
        System.out.println("Player :" + name);
    }

    public String name() {
        return name;
    }
    public int getValue() {

        return score;
    }

}
