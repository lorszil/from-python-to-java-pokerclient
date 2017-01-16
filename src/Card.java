import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Card {

    String cardCode;
    String cardColor;
    String cardValue;
    Integer intCardValue;

    private final static List<String> CARD_COLORS = Arrays.asList("S", "C", "D", "H");


    private static HashMap<String, Integer> alphabeticCardValue = new HashMap<>();

    static {
        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);
    }


    public Card(String cardCode) throws IllegalArgumentException {

        this.cardCode = cardCode.toUpperCase();
        this.cardColor = this.cardCode.substring(0, 1);
        this.cardValue = this.cardCode.substring(1);

        if (!CARD_COLORS.contains(cardColor))
        {
            throw new IllegalArgumentException("Card color isn't valid: " + this.cardColor);
        }

        if (alphabeticCardValue.get(this.cardValue) == null) {

            intCardValue = Integer.parseInt(this.cardValue);
            if (intCardValue > 10 || intCardValue < 2) {
                throw new IllegalArgumentException("Card number isn't valid: " + intCardValue);
            }
        }else {
            intCardValue = alphabeticCardValue.get(this.cardValue);
        }
    }

    public int getValue() {
        return this.intCardValue;
    }
}
