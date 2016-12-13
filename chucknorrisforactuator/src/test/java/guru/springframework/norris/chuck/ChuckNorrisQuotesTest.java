package guru.springframework.norris.chuck;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jt on 12/12/16.
 */
public class ChuckNorrisQuotesTest {

    @Test
    public void testGetRandomQuote() throws Exception {

        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

        assertNotNull(quotes.getRandomQuote());
    }
}
