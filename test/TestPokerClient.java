import org.junit.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestPokerClient {
    private PokerClient pokerClient;

    @Before
    public void setUp() throws Exception {
        pokerClient = new PokerClient("h2", "h3", "h4", "h5", "cj");
    }

    @Test
    public void highestCardIsMine() throws Exception {
        assertTrue(pokerClient.highestCardIsMine("s3", "s4", "s5", "s6", "c10"));
    }

    @Test
    public void  highestCardIsNotMine() throws Exception {
        assertFalse(pokerClient.highestCardIsMine("d2", "d3", "d4", "d5", "ck"));
    }

    @After
    public void tearDown() throws Exception {
        pokerClient = null;
    }
}


    //club      diamonds    spades  heart
    //treff     káró        pikk    szív
