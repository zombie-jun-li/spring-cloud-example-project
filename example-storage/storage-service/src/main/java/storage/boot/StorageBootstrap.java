package storage.boot;

import libra.framework.context.ContextInitializer;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jun
 */
@EnableAutoConfiguration
@SpringBootConfiguration
@EnableEurekaServer
@EnableConfigurationProperties
@ComponentScan(basePackageClasses = StorageBootstrap.class)
public class StorageBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(StorageBootstrap.class)
                .initializers(new ContextInitializer())
                .web(true)
                .run(args);
    }
}
