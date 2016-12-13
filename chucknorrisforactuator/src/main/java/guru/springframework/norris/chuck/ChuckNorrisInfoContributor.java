package guru.springframework.norris.chuck;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

/**
 * Created by jt on 12/12/16.
 */
public class ChuckNorrisInfoContributor implements InfoContributor {

    private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("Chuck Norris", quotes.getRandomQuote());
    }
}
