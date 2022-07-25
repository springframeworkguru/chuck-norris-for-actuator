package guru.springframework.config;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 12/13/16.
 */
@Configuration
public class ChuckNorrisConfig {

    /**
     * Returns new instance.
     * @return - instance
     */
    @Bean
    public ChuckNorrisInfoContributor chuckNorrisInfoContributor(){
        return new ChuckNorrisInfoContributor();
    }
}
