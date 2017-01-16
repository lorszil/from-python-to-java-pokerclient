import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class PokerClient {

    private List<Card> myCards = new ArrayList<>();

    public PokerClient(String card1, String card2, String card3, String card4, String card5) {
        myCards.addAll(Arrays.asList(new Card(card1), new Card(card2), new Card(card3), new Card(card4), new Card(card5)));
    }

    public boolean highestCardIsMine(String card1, String card2, String card3, String card4, String card5) {
        List<Card> computerCards = Arrays.asList(new Card(card1), new Card(card2), new Card(card3), new Card(card4), new Card(card5));

        OptionalInt myCardsHighest = myCards.stream().map(Card::getValue).mapToInt(Integer::intValue).max();
        OptionalInt computerCardsHighest = computerCards.stream().map(Card::getValue).mapToInt(Integer::intValue).max();


        return myCardsHighest.getAsInt() > computerCardsHighest.getAsInt();
    }

}