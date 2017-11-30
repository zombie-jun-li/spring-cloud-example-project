package eureka.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by jun.li
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(EurekaBootstrap.class)
                .web(true)
                .run(args);
    }
}
