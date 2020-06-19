package guru.springframework.norris.chuck;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jt on 12/12/16.
 */
public class ChuckNorrisQuotesTest {
    ChuckNorrisQuotes quotes;
    
    @Before
    public void initialize(){
        quotes = new ChuckNorrisQuotes();
    }

    @Test
    public void testGetRandomQuote() throws Exception {
        assertNotNull(quotes.getRandomQuote());
    }
}
