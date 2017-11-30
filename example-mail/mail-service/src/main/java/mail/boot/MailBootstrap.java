package mail.boot;

import libra.framework.context.BootStrap;
import libra.framework.context.ContextInitializer;
import libra.framework.site.DefaultConfig;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

/**
 * Created by jun
 */
@BootStrap
@Import(value = DefaultConfig.class)
public class MailBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(MailBootstrap.class)
                .initializers(new ContextInitializer())
                .web(true)
                .run(args);
    }
}
