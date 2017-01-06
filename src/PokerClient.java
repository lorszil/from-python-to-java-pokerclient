import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerClient {

    public Card card1, card2, card3, card4, card5;

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        this.card1 = new Card(p1.toUpperCase());
        this.card2 = new Card(p2.toUpperCase());
        this.card3 = new Card(p3.toUpperCase());
        this.card4 = new Card(p4.toUpperCase());
        this. card5 = new Card(p5.toUpperCase());
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card highestCard = new Card("s2");
        List<Card> ownCardList = new ArrayList<>(Arrays.asList(new Card(p1), new Card(p2), new Card(p3), new Card(p4), new Card(p5)));
        List<Card> machineCardList = new ArrayList<>(Arrays.asList(card1, card2, card3, card4, card5));

        for (int i = 0; i < ownCardList.size(); i++) {
            Card machineCard = machineCardList.get(i);
            for (int j = 0; j < ownCardList.size(); j++) {
                Card ownCard = ownCardList.get(j);
                if (ownCard.getValue() > machineCard.getValue()) {
                    if (ownCard.getValue() > highestCard.getValue()) {
                        highestCard = ownCard;
                    }
                } else {
                    if (machineCard.getValue() > highestCard.getValue()) {
                        highestCard = machineCard;
                    }
                }
            }
        }

        return machineCardList.contains(highestCard);
    }

}