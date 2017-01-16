import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TestCard {

    private Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card("hQ");
    }

    @Test
    public void testGetValue() throws Exception {

    }

    @Test
    public void checkCardCodeIsValid() {
        assertEquals("hQ", card.cardCode);
    }

    @Test
    public void getValueIfItsALetter(){
        card = new Card("HJ");
        assertEquals(11, card.getValue());
    }

    @Test
    public void getValueIfItsANumber() throws Exception {
        assertEquals(12, card.getValue());
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkCardCodeIsNotValidSoItThrowsError_1() {
        card = new Card("sz28");
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkCardCodeIsNotValidSoItThrowsError_2() {
        card = new Card("HA_JA_FA");
    }


    @After
    public void tearDown() throws Exception {
        card = null;
    }

}
