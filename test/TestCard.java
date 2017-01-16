import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TestCard {

    private Card card;


    @Test
    public void testGetValue() throws Exception {

    }

    @Test
    public void checkCardCodeIsValid() {
        card = new Card("Hq");
        assertEquals("HQ", card.cardCode);
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkCardCodeIsNotValid() {
        card = new Card("f2");
    }

    @Test
    public void getValueIfItsALetter(){
        card = new Card("HJ");
        assertEquals(11, card.getValue());
    }

    @Test
    public void getValueIfItsANumber() throws Exception {
        card = new Card("hq");
        assertEquals(12, card.getValue());
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkCardCodeIsOver10() {
        card = new Card("s12");
    }


    @Test (expected = IllegalArgumentException.class)
    public void checkCardValueIsUnder2() {
        card = new Card("h1");
    }

    @Test
    public void checkGetValueIsUnder10() {
        card = new Card("h9");
        assertEquals(9, card.getValue());
    }

    @Test
    public void checkGetIntValueOfTheHighestCard() {
        card = new Card("ha");
        assertEquals(14, card.getValue());
    }



}
