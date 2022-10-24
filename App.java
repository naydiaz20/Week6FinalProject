import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Deck cardDeck = new Deck();

        Player PlayerN = new Player("playerN");
        Player PlayerD = new Player("playerD");

        cardDeck.shuffle();

        System.out.println("Description of Players : ");
        PlayerN.describe();

        PlayerD.describe();

        for (int i = 0; i <52; i++) {
            if (i % 2 ==0) {
                PlayerN.draw(cardDeck);
            } else {
                PlayerD.draw(cardDeck);
            }
        }


        for(int flips = 0; flips <26; flips ++) {

        Card toPlayerNFlipsCard = PlayerN.flip();
        Card toPlayerDFlipsCard = PlayerD.flip();

            System.out.println("Player N flipped : " + toPlayerNFlipsCard.getName());
            System.out.println("Player D flipped : " + toPlayerDFlipsCard.getName());

            if(toPlayerNFlipsCard.getValue() >  toPlayerDFlipsCard .getValue()) {
                PlayerN.incrementScore();
            } else if (toPlayerNFlipsCard.getValue() <  toPlayerDFlipsCard .getValue()) {
                PlayerD.incrementScore();
            }
        }



        System.out.println("Player N score = " + PlayerN.getScore());

        System.out.println("Player D score = " + PlayerD.getScore());

        if(PlayerN.getScore() > PlayerD.getScore()) {
            System.out.println("Player N Wins!");
        } else if (PlayerN.getScore() < PlayerD.getScore()) {
            System.out.println("Player D Wins!");
        }

    }
}
