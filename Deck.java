import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    ArrayList<Card> deck = new ArrayList<Card>();

    String[] suits = {"Clubs" , "Diamonds" , "Hearts" , "Spades" };
    String[] nameOfCards = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

    public Deck() {


        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < 13; j++) {
                int currentValue = j + 2;
                Card cardToAdd = new Card(j + 2,nameOfCards[j] +" of " + suits[i]);
                cardToAdd.describe();
                deck.add(cardToAdd);


            }
        }

    }
    public <Cards> void shuffle() {
        Collections.shuffle(deck); {
        }
    }

    public Card draw() {
        Card drawnCard = deck.remove(0);
        drawnCard.describe();
        return drawnCard;
    }
    public String[] getSuits() {
        return suits;
    }
    public String[] getNameofcards() {
        return nameOfCards;

    }
    public void describeCardsInDeck() {
        for (Card currentCard: deck) {
            currentCard.describe();
        }
    }
}
