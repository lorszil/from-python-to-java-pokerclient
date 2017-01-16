import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Card {

    String cardCode;
    String cardColor;
    String cardValue;

    private final List<String> cardColors = Arrays.asList("S", "C", "D", "H");

    HashMap<String, Integer> alphabeticCardValue = new HashMap<>();
    Integer intCardValue;


    public Card(String cardCode) throws IllegalArgumentException {

        this.cardCode = cardCode;
        this.cardColor = this.cardCode.substring(0, 1).toUpperCase();
        this.cardValue = this.cardCode.substring(1).toUpperCase();

        if (!cardColors.contains(cardColor))
        {
            throw new IllegalArgumentException("Card color isn't valid: " + this.cardColor);
        }


        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);

        if (alphabeticCardValue.get(this.cardValue) == null) {

            intCardValue = Integer.parseInt(this.cardValue);
            if (intCardValue > 10 || intCardValue < 2) {
                throw new IllegalArgumentException("Card number isn't valid: " + intCardValue);
            }
        }
    }

    public int getValue() {

        if (alphabeticCardValue.get(this.cardValue) == null) {
            intCardValue = Integer.parseInt(this.cardValue);
        } else {
            intCardValue = alphabeticCardValue.get(this.cardValue);
        }
        return intCardValue;
    }
}
