package guru.springframework.norris.chuck;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

/**
 * Chuck Norris Information Contributor for Spring Boot Actuator.
 *
 * This will add random Chuck Norris Quotes to the info tab, when you are using Spring Boot Actuator.
 *
 * See GitHub Readme or ChuckNorrisDemo project for working example.
 * @author John Thompson
 */
public class ChuckNorrisInfoContributor implements InfoContributor {

    private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("Chuck Norris", quotes.getRandomQuote());
    }
}
