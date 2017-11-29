package mail.boot;

import libra.framework.context.ContextInitializer;
import libra.framework.site.DefaultConfig;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by jun
 */
@EnableAutoConfiguration
@SpringBootConfiguration
@EnableEurekaServer
@EnableConfigurationProperties
@ComponentScan(basePackageClasses = MailBootstrap.class)
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
