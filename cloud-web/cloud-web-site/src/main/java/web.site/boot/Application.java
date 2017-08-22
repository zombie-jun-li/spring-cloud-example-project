package web.site.boot;

import libra.framework.context.ContextInitializer;
import mail.api.service.MailService;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import storage.api.service.StorageService;
import web.service.boot.CloudWebServiceConfig;

/**
 * Created by jun.
 */
@EnableAutoConfiguration
@SpringBootConfiguration
@EnableEurekaClient
@EnableFeignClients(basePackageClasses = {MailService.class, StorageService.class})
@EnableConfigurationProperties
@ComponentScan(basePackageClasses = {Application.class, CloudWebServiceConfig.class})
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .initializers(new ContextInitializer())
                .web(true)
                .run(args);
    }
}
