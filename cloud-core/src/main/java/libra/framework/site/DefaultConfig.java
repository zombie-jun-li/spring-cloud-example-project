package libra.framework.site;

import libra.framework.management.ServerController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jun.
 */
@Configuration
public class DefaultConfig {
    @Bean
    public ServerController serverController() {
        return new ServerController();
    }
}
